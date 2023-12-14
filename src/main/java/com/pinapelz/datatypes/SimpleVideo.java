package com.pinapelz.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * Simple video object
 *
 * @author pinapelz
 * @version $Id: $Id
 */
@JsonIgnoreProperties (ignoreUnknown = true)
public class SimpleVideo {
    public String id;
    public String title;
    public String type;
    public String topic_id;
    public String published_at;
    public String available_at;
    public int duration;
    public String status;
    public String start_scheduled;
    public String start_actual;
    public String end_actual;
    public int live_viewers;
    public String description;
    public int songcount;
    public String channel_id;
    public Channel channel;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        SimpleVideo simpleVideo = (SimpleVideo) obj;
        return duration == simpleVideo.duration &&
                live_viewers == simpleVideo.live_viewers &&
                songcount == simpleVideo.songcount &&
                Objects.equals(id, simpleVideo.id) &&
                Objects.equals(title, simpleVideo.title) &&
                Objects.equals(type, simpleVideo.type) &&
                Objects.equals(topic_id, simpleVideo.topic_id) &&
                Objects.equals(published_at, simpleVideo.published_at) &&
                Objects.equals(available_at, simpleVideo.available_at) &&
                Objects.equals(status, simpleVideo.status) &&
                Objects.equals(start_scheduled, simpleVideo.start_scheduled) &&
                Objects.equals(start_actual, simpleVideo.start_actual) &&
                Objects.equals(end_actual, simpleVideo.end_actual) &&
                Objects.equals(description, simpleVideo.description) &&
                Objects.equals(channel_id, simpleVideo.channel_id) &&
                Objects.equals(channel, simpleVideo.channel);
    }
}
