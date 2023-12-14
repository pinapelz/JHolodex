package com.pinapelz.datatypes;

import java.util.List;
import java.util.Objects;

/**
 * Result object for a paginated comment search
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class CommentSearchResult {
    public int total;
    public List<SimpleCommentVideo> items;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        CommentSearchResult commentSearchResult = (CommentSearchResult) obj;
        return total == commentSearchResult.total &&
                Objects.equals(items, commentSearchResult.items);
    }
}
