package com.pinapelz.datatypes;

import java.util.List;
import java.util.Objects;

/**
 * Result object for a paginated video search
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class VideoSearchResult {
    public int total;
    public List<SimpleVideo> items;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        VideoSearchResult videoSearchResult = (VideoSearchResult) obj;
        return total == videoSearchResult.total &&
                Objects.equals(items, videoSearchResult.items);
    }
}
