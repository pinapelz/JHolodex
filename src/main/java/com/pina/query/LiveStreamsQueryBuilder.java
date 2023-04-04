package com.pina.query;

public class LiveStreamsQueryBuilder {
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

    public LiveStreamsQueryBuilder setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public LiveStreamsQueryBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public LiveStreamsQueryBuilder setInclude(String include) {
        this.include = include;
        return this;
    }

    public LiveStreamsQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public LiveStreamsQueryBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public LiveStreamsQueryBuilder setMaxUpcomingHours(Integer maxUpcomingHours) {
        this.maxUpcomingHours = maxUpcomingHours;
        return this;
    }

    public LiveStreamsQueryBuilder setMentionedChannelId(String mentionedChannelId) {
        this.mentionedChannelId = mentionedChannelId;
        return this;
    }

    public LiveStreamsQueryBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public LiveStreamsQueryBuilder setOrder(String order) {
        this.order = order;
        return this;
    }

    public LiveStreamsQueryBuilder setOrg(String org) {
        this.org = org;
        return this;
    }

    public LiveStreamsQueryBuilder setPaginated(String paginated) {
        this.paginated = paginated;
        return this;
    }

    public LiveStreamsQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public LiveStreamsQueryBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public LiveStreamsQueryBuilder setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public LiveStreamsQueryBuilder setType(String type) {
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