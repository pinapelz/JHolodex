package com.pinapelz.datatypes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * Video object
 *
 * @author pinapelz
 * @version $Id: $Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Video extends SimpleVideo {
    public List<Video> clips;
    public List<Video> sources;
    public List<Video> refers;
    public List<Video> simulcasts;
    public List<SimpleChannel> mentions;
    public String thumbnail;
    public List<Video> reccomendations;
    public List<Comment> comments;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Video video = (Video) obj;
        return Objects.equals(clips, video.clips) &&
                Objects.equals(sources, video.sources) &&
                Objects.equals(refers, video.refers) &&
                Objects.equals(simulcasts, video.simulcasts) &&
                Objects.equals(mentions, video.mentions) &&
                Objects.equals(thumbnail, video.thumbnail) &&
                Objects.equals(reccomendations, video.reccomendations) &&
                Objects.equals(comments, video.comments) &&
                super.equals(obj);
    }

}



