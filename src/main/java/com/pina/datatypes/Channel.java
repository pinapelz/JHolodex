package com.pina.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Channel object
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel extends SimpleChannel{
    public String suborg;
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
