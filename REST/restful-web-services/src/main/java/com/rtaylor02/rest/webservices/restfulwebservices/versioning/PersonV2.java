package com.rtaylor02.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {
    private Name name;
    public PersonV2() { }
    public PersonV2(Name name) { this.name = name; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    static class Name {
        private String firstName, lastName;

        public Name(String firstName, String lastName) { this.firstName = firstName; this.lastName = lastName; }
        public Name() { }

        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public String getLastName() { return lastName; }

        public void setLastName(String lastName) { this.lastName = lastName; }
    }
}
