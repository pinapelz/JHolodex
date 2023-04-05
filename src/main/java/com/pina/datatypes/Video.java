package com.pina.datatypes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video {
    public String id;
    public String title;
    public String type;
    public String topic;
    public String published_at;
    public String available_at;
    public int duration;
    public String status;
    public String start_scheduled;
    public String start_actual;
    public String thumbnail;
    public int live_viewers;
    public Channel channel;
}



