package com.rtaylor02.rest.webservices.restfulwebservices.understandingannotations;

public @interface ClassPreamble {
    String dob();
    String useCase();
    String author() default "Rod";
}

@interface OnlyOneElement {
    String description();
}
