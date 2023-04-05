package com.pina.query;


public class VideoQueryBuilder {
    private String videoId;
    private String lang;
    private String c;

    public String getVideoId() {
        return videoId;
    }

    public VideoQueryBuilder setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public VideoQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getC() {
        return c;
    }

    public VideoQueryBuilder setC(String c) {
        this.c = c;
        return this;
    }


}
