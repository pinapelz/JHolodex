package com.pinapelz.query;

import com.pinapelz.datatypes.Video;
import com.pinapelz.vtuber.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Query builder for getting a set of videos matching the given parameters
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class VideoQueryBuilder {
    private String channelId;
    private String id;
    private String include;
    private String lang;
    private Integer limit;
    private Integer maxUpcomingHours;
    private String mentionedChannelId;
    private Integer offset;
    private String order;
    private String org;
    private String paginated;
    private String sort;
    private String status;
    private String topic;
    private String type;

    /**
     * <p>Setter for the field <code>channelId</code>.</p>
     *
     * @param channelId a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>Setter for the field <code>include</code>.</p>
     *
     * @param include a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setInclude(String include) {
        this.include = include;
        return this;
    }

    /**
     * <p>Setter for the field <code>include</code>.</p>
     *
     * @param include a {@link com.pinapelz.vtuber.ExtraData} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setInclude(ExtraData include) {
        this.include = include.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>include</code>.</p>
     *
     * @param include a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setInclude(List<ExtraData> include){
        String[] includeStrings = new String[include.size()];
        for (int i = 0; i < include.size(); i++) {
            includeStrings[i] = include.get(i).toString();
        }
        this.include = String.join(",", includeStrings);
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link com.pinapelz.vtuber.Language} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setLang(Language lang) {
        this.lang = lang.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setLang(List<Language> lang) {
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
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>Setter for the field <code>maxUpcomingHours</code>.</p>
     *
     * @param maxUpcomingHours a {@link java.lang.Integer} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setMaxUpcomingHours(Integer maxUpcomingHours) {
        this.maxUpcomingHours = maxUpcomingHours;
        return this;
    }

    /**
     * <p>Setter for the field <code>mentionedChannelId</code>.</p>
     *
     * @param mentionedChannelId a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setMentionedChannelId(String mentionedChannelId) {
        this.mentionedChannelId = mentionedChannelId;
        return this;
    }

    /**
     * <p>Setter for the field <code>offset</code>.</p>
     *
     * @param offset a {@link java.lang.Integer} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * <p>Setter for the field <code>order</code>.</p>
     *
     * @param order a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * <p>Setter for the field <code>order</code>.</p>
     *
     * @param order a {@link com.pinapelz.vtuber.Order} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setOrder(Order order) {
        this.order = order.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>org</code>.</p>
     *
     * @param org a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setOrg(String org) {
        this.org = org;
        return this;
    }

    /**
     * <p>Setter for the field <code>org</code>.</p>
     *
     * @param org a {@link com.pinapelz.vtuber.Organization} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setOrg(Organization org) {
        this.org = org.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>paginated</code>.</p>
     *
     * @param paginated a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setPaginated(String paginated) {
        this.paginated = paginated;
        return this;
    }

    /**
     * <p>Setter for the field <code>sort</code>.</p>
     *
     * @param sort a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>Setter for the field <code>sort</code>.</p>
     *
     * @param sort a {@link com.pinapelz.vtuber.Sort} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setSort(Sort sort) {
        this.sort = sort.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>status</code>.</p>
     *
     * @param status a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>Setter for the field <code>status</code>.</p>
     *
     * @param status a {@link com.pinapelz.vtuber.Status} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>topic</code>.</p>
     *
     * @param topic a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * <p>Setter for the field <code>type</code>.</p>
     *
     * @param type a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.VideoQueryBuilder} object.
     */
    public VideoQueryBuilder setType(String type) {
        this.type = type;
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
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getId() {
        return id;
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
     * <p>Getter for the field <code>maxUpcomingHours</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getMaxUpcomingHours() {
        return maxUpcomingHours;
    }

    /**
     * <p>Getter for the field <code>mentionedChannelId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMentionedChannelId() {
        return mentionedChannelId;
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
     * <p>Getter for the field <code>order</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOrder() {
        return order;
    }

    /**
     * <p>Getter for the field <code>org</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOrg() {
        return org;
    }

    /**
     * <p>Getter for the field <code>paginated</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPaginated() {
        return paginated;
    }

    /**
     * <p>Getter for the field <code>sort</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSort() {
        return sort;
    }

    /**
     * <p>Getter for the field <code>status</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>Getter for the field <code>topic</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>Getter for the field <code>type</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getType() {
        return type;
    }
}
