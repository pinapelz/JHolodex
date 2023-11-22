package com.pinapelz.vtuber;

/**
 * <p>Sort class.</p>
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public enum Sort {
    NEWEST("newest"),
    START_SCHEDULED("start_scheduled"),
    START_ACTUAL("start_actual"),
    END_ACTUAL("end_actual"),
    OLDEST("oldest");

    private final String value;
    Sort(String value) {
        this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return value;
    }

    public boolean isSortBy(String sort) {
        return this.value.equals(sort);
    }

}
