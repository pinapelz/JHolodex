package com.pinapelz.datatypes;

import java.util.List;

/**
 * Result object for a paginated comment search
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class CommentSearchResult {
    public int total;
    public List<SimpleCommentVideo> items;
}
