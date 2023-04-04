package com.pina;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {
    public String id;
    public String english_name;
    public String name;
    public String org;
    public String suborg;
    public String photo;
    public String type;
}
