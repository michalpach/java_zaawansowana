package com.sda.exceptions;

class InvalidNameException extends RuntimeException {

    private final String invalidName;

    InvalidNameException(String invalidName){
        super("Name " + invalidName + "is invalid!");
        this.invalidName=invalidName;
    }

    public String getInvalidName() {
        return invalidName;
    }
}
