package com.mastermindsprogramming;

public class Shoe {
    // Fields
    private short size;
    private String name;

    // Methods
    public short getSize() {
        return this.size;
    }

    public String getName() {
        return name;
    }

    public void setSize(short size) {
        if((size < 50) && (size > 35))
        this.size = size;
    }

    public void setName(String name) {
        if((name.toLowerCase().equals("nike")) || (name.toLowerCase().equals("adidas")))
        this.name = name;
    }
}
