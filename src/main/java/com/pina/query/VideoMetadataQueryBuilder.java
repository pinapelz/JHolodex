package com.pina.query;


public class VideoMetadataQueryBuilder {
    /***
     * Used to get the metadata of a single video when given the video ID
     */
    private String videoId;
    private String lang;
    private String c;

    public String getVideoId() {
        return videoId;
    }

    public VideoMetadataQueryBuilder setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public VideoMetadataQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getC() {
        return c;
    }

    public VideoMetadataQueryBuilder setC(String c) {
        this.c = c;
        return this;
    }


}
