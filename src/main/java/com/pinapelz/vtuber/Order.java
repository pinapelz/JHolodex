package com.pinapelz.vtuber;

/**
 * <p>Order class.</p>
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public enum Order {
    ASC("asc"),
    DESC("desc");

    private final String value;
    Order(String value) {
        this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return value;
    }

    public boolean isOrderBy(String order) {
        return this.value.equals(order);
    }
}
