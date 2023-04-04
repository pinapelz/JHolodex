package com.pina;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LiveStream {
    public String id;
    public String title;
    public String thumbnail;
    public String status;
    public int viewers;
    public Channel channel;
}



