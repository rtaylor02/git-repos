package chapter9.lesson2point5;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
//            brokenOne(3);
            brokenTwo();
        } catch (SocketException se) {
            System.out.println("Oops, that broke!");
        }
    }

    public static void brokenOne(int mode) throws SocketException {
        System.out.println("Starting");
        try {
            System.out.println("in try");
            if(mode == 1) {
                System.out.println("Throwing EOFException");
                throw new EOFException();
            }
            System.out.println("Survived one");
            if(mode == 2) {
                System.out.println("Throwing FileNotFoundException");
                throw new FileNotFoundException();
            }
            System.out.println("Survived two");
            if(mode == 3) {
                System.out.println("Throwing SocketException");
                throw new SocketException();
            }
        } catch (EOFException eofe) {
            System.out.println("catching EOFException");
        } catch (FileNotFoundException fnfe) {
            System.out.println("catching FileNotFoundException");
        } finally {
            System.out.println("in finally");
        }
        System.out.println("Method completing");
    }

    public static void brokenTwo() throws IOException {
        System.out.println("Starting");
        int retriesLeft = 2;
        boolean success = false;
        while(!success) {
            try {
                System.out.println("in try");
                if(Math.random() > 0.1) {
                    System.out.println("throwing FileNotFoundException");
                    throw new FileNotFoundException();
                }
                success = true;
                System.out.println("Survived two");
            } catch (FileNotFoundException fnfe) {
                System.out.println("catching FileNotFoundException");
                if(retriesLeft-- == 0) {
                    System.out.println("Too many retries; giving up..");
                    throw new IOException("Too many retries", fnfe);
                }
            } finally {
                System.out.println("in finally");
            }
        }
        System.out.println("Method completing");
    }
}
