package com.pinapelz.vtuber;

public enum ExtraData {
    CLIPS("clips"),
    REFERS("refers"),
    SOURCES("sources"),
    SIMULCASTS("simulcasts"),
    MENTIONS("mentions"),
    DESCRIPTION("description"),
    LIVE_INFO("live_info"),
    CHANNEL_STATS("channel_stats"),
    SONGS("songs");

    private final String value;

    ExtraData(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }


}
