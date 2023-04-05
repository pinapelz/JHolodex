package com.pina.query;

public class VideosByChannelIDQuery {
    private String channelId;
    private String type;
    private String include;
    private String lang;
    private Integer limit;
    private Integer offset;
    private String paginated;

    public VideosByChannelIDQuery setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public VideosByChannelIDQuery setType(String type) {
        this.type = type;
        return this;
    }

    public VideosByChannelIDQuery setInclude(String include) {
        this.include = include;
        return this;
    }

    public VideosByChannelIDQuery setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public VideosByChannelIDQuery setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public VideosByChannelIDQuery setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public VideosByChannelIDQuery setPaginated(String paginated) {
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
