package com.pina.datatypes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video extends SimpleVideo {
    public List<Video> clips;
    public List<Video> sources;
    public List<Video> refers;
    public List<Video> simulcasts;
    public List<SimpleChannel> mentions;
    public String thumbnail;
    public int songs;
}



