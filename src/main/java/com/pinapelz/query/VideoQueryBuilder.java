package com.pinapelz.query;

/**
 * Query builder for getting a set of videos matching the given parameters
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

    public VideoQueryBuilder setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public VideoQueryBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public VideoQueryBuilder setInclude(String include) {
        this.include = include;
        return this;
    }

    public VideoQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public VideoQueryBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public VideoQueryBuilder setMaxUpcomingHours(Integer maxUpcomingHours) {
        this.maxUpcomingHours = maxUpcomingHours;
        return this;
    }

    public VideoQueryBuilder setMentionedChannelId(String mentionedChannelId) {
        this.mentionedChannelId = mentionedChannelId;
        return this;
    }

    public VideoQueryBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public VideoQueryBuilder setOrder(String order) {
        this.order = order;
        return this;
    }

    public VideoQueryBuilder setOrg(String org) {
        this.org = org;
        return this;
    }

    public VideoQueryBuilder setPaginated(String paginated) {
        this.paginated = paginated;
        return this;
    }

    public VideoQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public VideoQueryBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public VideoQueryBuilder setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public VideoQueryBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getId() {
        return id;
    }

    public String getInclude() {
        return include;
    }

    public String getLang() {
        return lang;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getMaxUpcomingHours() {
        return maxUpcomingHours;
    }

    public String getMentionedChannelId() {
        return mentionedChannelId;
    }

    public Integer getOffset() {
        return offset;
    }

    public String getOrder() {
        return order;
    }

    public String getOrg() {
        return org;
    }

    public String getPaginated() {
        return paginated;
    }

    public String getSort() {
        return sort;
    }

    public String getStatus() {
        return status;
    }

    public String getTopic() {
        return topic;
    }

    public String getType() {
        return type;
    }
}