package com.rtaylor02.rest.webservices.restfulwebservices.users;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    // Retrieve all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // Retrieve single user
    @GetMapping("/users/{id}")
    public Resource retrieveUser(@PathVariable int id) {
        User retrievedUser = service.findOne(id);
        if(retrievedUser == null) {
            throw new UserNotFoundException(String.format("[id:%d]",id));
        }

        // HATEOAS
        Resource r = new Resource(retrievedUser);
        r.add(linkTo(methodOn(this.getClass()).retrieveAllUsers()).withRel("all-users"));

        return r;
    }

    // Delete single user
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User deletedUser = service.deleteById(id);
        if(deletedUser == null) {
            throw new UserNotFoundException(String.format("[id:%d]",id));
        }
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        User newUser = service.save(user);

        // Get the location of the new user
        URI location = ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(newUser.getId())
                        .toUri();

        return ResponseEntity.created(location).build();
    }

    private class Resource extends RepresentationModel<Resource> {
        private User content;

        @JsonCreator
        public Resource() { }

        @JsonCreator
        public Resource(@JsonProperty("content") User user) {
            this.content = user;
        }

        public User getContent() { return this.content; }
    }

}
