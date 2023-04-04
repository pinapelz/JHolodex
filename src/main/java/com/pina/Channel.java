package com.pina;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {
    public String english_name;
    public String id;
    public String name;
    public String photo;
    public String type;
}
