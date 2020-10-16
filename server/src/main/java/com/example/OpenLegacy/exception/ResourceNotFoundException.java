package com.example.OpenLegacy.exception;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUid = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
    public ResourceNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }

}
