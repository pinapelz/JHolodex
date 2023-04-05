package com.pina.query;

public class VideosByChannelIDQueryBuilder {
    /***
     * Used to get the videos of a single channel when given the channel ID
     */
    private String channelId;
    private String type;
    private String include;
    private String lang;
    private Integer limit;
    private Integer offset;
    private String paginated;

    public VideosByChannelIDQueryBuilder setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public VideosByChannelIDQueryBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public VideosByChannelIDQueryBuilder setInclude(String include) {
        this.include = include;
        return this;
    }

    public VideosByChannelIDQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public VideosByChannelIDQueryBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public VideosByChannelIDQueryBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public VideosByChannelIDQueryBuilder setPaginated(String paginated) {
        this.paginated = paginated;
        return this;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getType() {
        return type;
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

    public Integer getOffset() {
        return offset;
    }

    public String getPaginated() {
        return paginated;
    }

}
