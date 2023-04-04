package com.pina;

public class HolodexException extends Exception{
    public HolodexException(String message) {
        super(message);
    }

    public HolodexException(String message, Throwable cause) {
        super(message, cause);
    }
}
