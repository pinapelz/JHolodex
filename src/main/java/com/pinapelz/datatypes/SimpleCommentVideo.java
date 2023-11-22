package com.pinapelz.datatypes;

import java.util.List;

/**
 * The same as SimpleVideo, but with comments
 *
 * @see SimpleVideo
 * @author pinapelz
 * @version $Id: $Id
 */
public class SimpleCommentVideo {
    public String id;
    public String title;
    public String type;
    public String published_at;
    public String available_at;
    public int duration;
    public String status;
    public int songcount;
    public SimpleChannel channel;
    public List<Comment> comments;
}
