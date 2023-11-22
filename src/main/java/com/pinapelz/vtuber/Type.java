package com.pinapelz.vtuber;

/**
 * <p>Type class.</p>
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public enum Type {
    STREAM("stream"),
    CLIP("clip");

    private final String value;
    Type(String value) {
        this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return value;
    }


    public boolean equals(Type other) {
        return this.value.equals(other.value);
    }

    public boolean isType(String type) {
        return this.value.equals(type);
    }


}
