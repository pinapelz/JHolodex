package com.pina.datatypes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video {
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
    public List<Video> clips;
    public List<Video> refers;
    public List<Channel> mentions;
    public String thumbnail;
    public Channel channel;
    public int songs;
}



