package com.pinapelz.datatypes;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        SimpleCommentVideo simpleCommentVideo = (SimpleCommentVideo) obj;
        return duration == simpleCommentVideo.duration &&
                songcount == simpleCommentVideo.songcount &&
                Objects.equals(id, simpleCommentVideo.id) &&
                Objects.equals(title, simpleCommentVideo.title) &&
                Objects.equals(type, simpleCommentVideo.type) &&
                Objects.equals(published_at, simpleCommentVideo.published_at) &&
                Objects.equals(available_at, simpleCommentVideo.available_at) &&
                Objects.equals(status, simpleCommentVideo.status) &&
                Objects.equals(channel, simpleCommentVideo.channel) &&
                Objects.equals(comments, simpleCommentVideo.comments);
    }
}
