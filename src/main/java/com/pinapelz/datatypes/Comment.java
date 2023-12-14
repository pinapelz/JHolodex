package com.pinapelz.datatypes;

import java.util.Objects;

/**
 * Comment object
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class Comment {
    public String comment_key;
    public String video_id;
    public String message;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Comment comment = (Comment) obj;
        return Objects.equals(comment_key, comment.comment_key) &&
                Objects.equals(video_id, comment.video_id) &&
                Objects.equals(message, comment.message);
    }
}
