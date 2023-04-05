package com.pina;

import java.util.List;

import com.pina.datatypes.Channel;
import com.pina.datatypes.Video;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HolodexService {
    @GET("/api/v2/live")
    Call<List<Video>> getLiveVideos(
            @Query("channelID") String channelID,
            @Query("id") String id,
            @Query("include") String include,
            @Query("lang") String lang,
            @Query("limit") Integer limit,
            @Query("maxUpcomingHours") Integer offset,
            @Query("mentionedChannelID") String mentionedChannelID,
            @Query("offset") Integer maxUpcomingHours,
            @Query("order") String order,
            @Query("org") String org,
            @Query("paginated") String paginated,
            @Query("sort") String sort,
            @Query("status") String status,
            @Query("topic") String topic,
            @Query("type") String type
    );

    @GET("/api/v2/videos")
    Call<List<Video>> getVideos(
            @Query("channelID") String channelID,
            @Query("id") String id,
            @Query("include") String include,
            @Query("lang") String lang,
            @Query("limit") Integer limit,
            @Query("maxUpcomingHours") Integer offset,
            @Query("mentionedChannelID") String mentionedChannelID,
            @Query("offset") Integer maxUpcomingHours,
            @Query("order") String order,
            @Query("org") String org,
            @Query("paginated") String paginated,
            @Query("sort") String sort,
            @Query("status") String status,
            @Query("topic") String topic,
            @Query("type") String type
    );

    @GET("/api/v2/channels/{channelID}")
    Call<Channel> getChannel(
            @Path("channelID") String channelID
    );

    @GET("/api/v2/channels/{channelID}/{type}")
    Call<List<Video>> getVideosByChannelId(
            @Path("channelID") String channelID,
            @Path("type") String type,
            @Query("include") String include,
            @Query("lang") String lang,
            @Query("limit") Integer limit,
            @Query("offset") Integer offset,
            @Query("paginated") String paginated
    );

    @GET("/api/v2/users/live")
    Call<List<Video>> getVideosFromChannels(
            @Query("channels") String channels
    );

    @GET("/api/v2/videos/{videoID}")
    Call<Video> getVideo(
            @Path("videoID") String videoID,
            @Query("lang") String lang,
            @Query("c") String c
    );

    @GET("/api/v2/channels")
    Call<List<Channel>> getChannels(
            @Query("limit") Integer limit,
            @Query("offset") Integer offset,
            @Query("type") String type,
            @Query("lang") String lang,
            @Query("order") String order,
            @Query("org") String org,
            @Query("sort") String sort
    );

}

