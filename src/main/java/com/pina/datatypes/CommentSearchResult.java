package com.pina.datatypes;

import java.util.List;

/**
 * Result object for a paginated comment search
 */
public class CommentSearchResult {
    public int total;
    public List<SimpleCommentVideo> items;
}
