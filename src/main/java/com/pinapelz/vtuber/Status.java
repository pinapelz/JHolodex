package com.pinapelz.vtuber;

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

    @Override
    public String toString() {
        return value;
    }

}
