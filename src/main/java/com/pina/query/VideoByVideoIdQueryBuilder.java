package com.pina.query;


public class VideoByVideoIdQueryBuilder {
    /***
     * Used to get the metadata of a single video when given the video ID
     */
    private String videoId;
    private String lang;
    private String c;

    public String getVideoId() {
        return videoId;
    }

    public VideoByVideoIdQueryBuilder setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public VideoByVideoIdQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getC() {
        return c;
    }

    public VideoByVideoIdQueryBuilder setC(String c) {
        this.c = c;
        return this;
    }


}
