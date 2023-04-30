package com.pinapelz.query;

import com.pinapelz.datatypes.Video;
import com.pinapelz.vtuber.Language;

import java.util.List;

/**
 * Query builder for getting a video by video id
 */
public class VideoByVideoIdQueryBuilder {
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

    public VideoByVideoIdQueryBuilder setLang(Language lang) {
        this.lang = lang.toString();
        return this;
    }

    public VideoByVideoIdQueryBuilder setLang(List<Language> language) {
        String[] languages = new String[language.size()];
        for (int i = 0; i < language.size(); i++) {
            languages[i] = language.get(i).toString();
        }
        this.lang = String.join(",", languages);
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
