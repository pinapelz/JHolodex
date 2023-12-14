package com.pinapelz.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * Channel object
 *
 * @author pinapelz
 * @version $Id: $Id
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Channel channel = (Channel) obj;
        return Objects.equals(suborg, channel.suborg) &&
                Objects.equals(banner, channel.banner) &&
                Objects.equals(twitter, channel.twitter) &&
                Objects.equals(video_count, channel.video_count) &&
                Objects.equals(subscriber_count, channel.subscriber_count) &&
                Objects.equals(view_count, channel.view_count) &&
                Objects.equals(clip_count, channel.clip_count) &&
                Objects.equals(lang, channel.lang) &&
                Objects.equals(published_at, channel.published_at) &&
                inactive == channel.inactive &&
                Objects.equals(description, channel.description) &&
                super.equals(obj);
    }
}
