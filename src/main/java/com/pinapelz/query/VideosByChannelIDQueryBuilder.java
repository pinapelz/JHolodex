package com.pinapelz.query;

import com.pinapelz.vtuber.ExtraData;
import com.pinapelz.vtuber.Language;

import java.util.List;

/**
 * Query builder for getting videos by a given channel id
 */
public class VideosByChannelIDQueryBuilder {
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

    public VideosByChannelIDQueryBuilder setInclude(String[] include) {
        this.include = String.join(",", include);
        return this;
    }

    public VideosByChannelIDQueryBuilder setInclude(ExtraData[] include) {
        String[] includeStrings = new String[include.length];
        for (int i = 0; i < include.length; i++) {
            includeStrings[i] = include[i].toString();
        }
        this.include = String.join(",", includeStrings);
        return this;
    }

    public VideosByChannelIDQueryBuilder setInclude(ExtraData include) {
        this.include = include.toString();
        return this;
    }



    public VideosByChannelIDQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public VideosByChannelIDQueryBuilder setLang(Language lang) {
        this.lang = lang.toString();
        return this;
    }

    public VideosByChannelIDQueryBuilder setLang(List<Language> lang){
        String[] langStrings = new String[lang.size()];
        for (int i = 0; i < lang.size(); i++) {
            langStrings[i] = lang.get(i).toString();
        }
        this.lang = String.join(",", langStrings);
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
