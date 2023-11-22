package com.pinapelz.query;

import com.pinapelz.datatypes.Video;
import com.pinapelz.vtuber.Language;

import java.util.List;

/**
 * Query builder for getting a video by video id
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class VideoByVideoIdQueryBuilder {
    private String videoId;
    private String lang;
    private String c;

    /**
     * <p>Getter for the field <code>videoId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * <p>Setter for the field <code>videoId</code>.</p>
     *
     * @param videoId a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoByVideoIdQueryBuilder} object.
     */
    public VideoByVideoIdQueryBuilder setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    /**
     * <p>Getter for the field <code>lang</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLang() {
        return lang;
    }


    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoByVideoIdQueryBuilder} object.
     */
    public VideoByVideoIdQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link com.pinapelz.vtuber.Language} object.
     * @return a {@link com.pinapelz.query.VideoByVideoIdQueryBuilder} object.
     */
    public VideoByVideoIdQueryBuilder setLang(Language lang) {
        this.lang = lang.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param language a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.VideoByVideoIdQueryBuilder} object.
     */
    public VideoByVideoIdQueryBuilder setLang(List<Language> language) {
        String[] languages = new String[language.size()];
        for (int i = 0; i < language.size(); i++) {
            languages[i] = language.get(i).toString();
        }
        this.lang = String.join(",", languages);
        return this;
    }

    /**
     * <p>Getter for the field <code>c</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getC() {
        return c;
    }

    /**
     * <p>Setter for the field <code>c</code>.</p>
     *
     * @param c a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoByVideoIdQueryBuilder} object.
     */
    public VideoByVideoIdQueryBuilder setC(String c) {
        this.c = c;
        return this;
    }


}
