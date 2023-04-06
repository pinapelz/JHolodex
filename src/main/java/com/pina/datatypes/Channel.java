package com.pina.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {
    public String id;
    public String name;
    public String english_name;
    public String org;
    public String suborg;
    public String photo;
    public String banner;
    public String twitter;
    public String video_count;
    public String subscriber_count;
    public String view_count;
    public String clip_count;
    public String lang;
    public String published_at;
    public boolean inactive;
    public String description;
}
