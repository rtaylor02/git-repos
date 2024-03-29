package com.rtaylor02.rest.webservices.restfulwebservices.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

//@ApiModel(description = "All details about the user")
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min = 2,message = "Name must be min 2 characters")
    private String name;
    @Past(message = "Future date as DOB")
    private Date birthDate;

    protected User() {  }

    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
