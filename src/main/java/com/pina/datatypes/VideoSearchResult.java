package com.pina.datatypes;

import java.util.List;

/**
 * Result object for a paginated video search
 */
public class VideoSearchResult {
    public int total;
    public List<SimpleVideo> items;
}
