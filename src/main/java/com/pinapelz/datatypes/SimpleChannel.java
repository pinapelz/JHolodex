package com.pinapelz.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * Simple channel object
 *
 * @author pinapelz
 * @version $Id: $Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleChannel {
    public String id;
    public String name;
    public String english_name;
    public String type;
    public String photo;
    public String org;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        SimpleChannel simpleChannel = (SimpleChannel) obj;
        return Objects.equals(id, simpleChannel.id) &&
                Objects.equals(name, simpleChannel.name) &&
                Objects.equals(english_name, simpleChannel.english_name) &&
                Objects.equals(type, simpleChannel.type) &&
                Objects.equals(photo, simpleChannel.photo) &&
                Objects.equals(org, simpleChannel.org);
    }
}
