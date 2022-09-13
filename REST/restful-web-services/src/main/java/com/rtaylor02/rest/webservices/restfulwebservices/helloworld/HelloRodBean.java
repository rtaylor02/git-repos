package com.rtaylor02.rest.webservices.restfulwebservices.helloworld;

public class HelloRodBean {
    private String message;

    public HelloRodBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("Hello Rod! Message is = %s", this.message);
    }
}
