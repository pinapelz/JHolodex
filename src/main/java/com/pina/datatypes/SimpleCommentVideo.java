package com.pina.datatypes;

import java.util.List;

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
