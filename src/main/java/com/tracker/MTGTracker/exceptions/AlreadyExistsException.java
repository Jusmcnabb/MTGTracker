package com.tracker.MTGTracker.exceptions;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException (String message) {
        super(message);
    }
    
}
