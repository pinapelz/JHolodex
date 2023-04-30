package com.pinapelz.vtuber;

public enum Type {
    STREAM("stream"),
    CLIP("clip");

    private final String value;
    Type(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
