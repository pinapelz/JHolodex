package com.pinapelz.vtuber;

/**
 * <p>Status class.</p>
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public enum Status {
    LIVE("live"),
    UPCOMING("upcoming"),
    PAST("past"),
    MISSING("missing"),
    ALL("all");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return value;
    }

    public boolean isStatus(String status) {
        return this.value.equals(status);
    }

}
