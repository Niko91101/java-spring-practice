package com.github.niko91101.springpractice.exception;

public class UserNotFoundExeption extends RuntimeException{
    public UserNotFoundExeption(long id) {
        super("User with id " + id + " not found");
    }
}
