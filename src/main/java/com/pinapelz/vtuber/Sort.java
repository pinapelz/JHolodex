package com.pinapelz.vtuber;

public enum Sort {
    NEWEST("newest"),
    START_SCHEDULED("start_scheduled"),
    START_ACTUAL("start_actual"),
    END_ACTUAL("end_actual");

    private final String value;
    Sort(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
