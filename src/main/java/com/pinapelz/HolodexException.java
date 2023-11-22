package com.pinapelz;

/**
 * Class for Holodex related exceptions
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class HolodexException extends Exception{
    /**
     * Instantiates a new Holodex exception.
     *
     * @param message the message
     */
    public HolodexException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Holodex exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public HolodexException(String message, Throwable cause) {
        super(message, cause);
    }
}
