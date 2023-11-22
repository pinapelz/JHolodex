package com.pinapelz.query;

import com.pinapelz.vtuber.ExtraData;
import com.pinapelz.vtuber.Language;

import java.util.List;

/**
 * Query builder for getting videos by a given channel id
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class VideosByChannelIDQueryBuilder {
    private String channelId;
    private String type;
    private String include;
    private String lang;
    private Integer limit;
    private Integer offset;
    private String paginated;

    /**
     * <p>Setter for the field <code>channelId</code>.</p>
     *
     * @param channelId a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * <p>Setter for the field <code>type</code>.</p>
     *
     * @param type a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>Setter for the field <code>include</code>.</p>
     *
     * @param include a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setInclude(String include) {
        this.include = include;
        return this;
    }

    /**
     * <p>Setter for the field <code>include</code>.</p>
     *
     * @param include an array of {@link java.lang.String} objects.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setInclude(String[] include) {
        this.include = String.join(",", include);
        return this;
    }

    /**
     * <p>Setter for the field <code>include</code>.</p>
     *
     * @param include an array of {@link com.pinapelz.vtuber.ExtraData} objects.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setInclude(ExtraData[] include) {
        String[] includeStrings = new String[include.length];
        for (int i = 0; i < include.length; i++) {
            includeStrings[i] = include[i].toString();
        }
        this.include = String.join(",", includeStrings);
        return this;
    }

    /**
     * <p>Setter for the field <code>include</code>.</p>
     *
     * @param include a {@link com.pinapelz.vtuber.ExtraData} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setInclude(ExtraData include) {
        this.include = include.toString();
        return this;
    }



    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link com.pinapelz.vtuber.Language} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setLang(Language lang) {
        this.lang = lang.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setLang(List<Language> lang){
        String[] langStrings = new String[lang.size()];
        for (int i = 0; i < lang.size(); i++) {
            langStrings[i] = lang.get(i).toString();
        }
        this.lang = String.join(",", langStrings);
        return this;
    }

    /**
     * <p>Setter for the field <code>limit</code>.</p>
     *
     * @param limit a {@link java.lang.Integer} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>Setter for the field <code>offset</code>.</p>
     *
     * @param offset a {@link java.lang.Integer} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * <p>Setter for the field <code>paginated</code>.</p>
     *
     * @param paginated a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideosByChannelIDQueryBuilder} object.
     */
    public VideosByChannelIDQueryBuilder setPaginated(String paginated) {
        this.paginated = paginated;
        return this;
    }

    /**
     * <p>Getter for the field <code>channelId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * <p>Getter for the field <code>type</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getType() {
        return type;
    }

    /**
     * <p>Getter for the field <code>include</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInclude() {
        return include;
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
     * <p>Getter for the field <code>limit</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>Getter for the field <code>offset</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * <p>Getter for the field <code>paginated</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPaginated() {
        return paginated;
    }

}
