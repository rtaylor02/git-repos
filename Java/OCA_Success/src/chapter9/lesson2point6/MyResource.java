package chapter9.lesson2point6;

import java.io.IOException;

public class MyResource implements AutoCloseable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing resources via implicit finally");
        throw new IOException();
    }
}
