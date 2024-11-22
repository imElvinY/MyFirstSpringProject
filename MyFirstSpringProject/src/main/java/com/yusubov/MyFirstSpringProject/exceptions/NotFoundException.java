package com.yusubov.MyFirstSpringProject.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {

        super(message);
    }
}
