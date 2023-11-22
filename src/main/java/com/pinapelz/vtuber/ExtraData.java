package com.pinapelz.vtuber;

/**
 * <p>ExtraData class.</p>
 *
 * @author pinapelz
 * @version $Id: $Id
 */
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

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return value;
    }

    public boolean isExtraData(String extraData) {
        return this.value.equals(extraData);
    }


}
