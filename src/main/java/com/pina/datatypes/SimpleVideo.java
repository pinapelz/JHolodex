package com.pina.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Simple video object
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
}
