package com.pinapelz.datatypes;

import java.util.List;

/**
 * Result object for a paginated video search
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class VideoSearchResult {
    public int total;
    public List<SimpleVideo> items;
}
