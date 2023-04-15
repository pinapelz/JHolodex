package com.pina;

import com.pina.datatypes.*;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

import javax.xml.transform.Result;
import java.util.List;

/**
 * The interface Holodex service.
 */
public interface HolodexService {
    /**
     * /api/v2/live endpoint
     *
     * @param channel_id           the YouTube channel id
     * @param id                   the YouTube video id
     * @param include              the include parameters
     * @param lang                 a comma separated String of languages (e.g "en,ja")
     * @param limit                the limit for the number of results
     * @param maxUpcomingHours     number of maximum hours to show upcoming videos
     * @param mentioned_channel_id the mentioned channel id of a different channel (for collabs)
     * @param offset               the offset for the number of results
     * @param order                the order (asc, desc)
     * @param org                  the organization of which to get videos for (e.g. "Hololive")
     * @param paginated            paginated field
     * @param sort                 sort by returned field (e.g "start_scheduled")
     * @param status               filter by video status (e.g. "upcoming")
     * @param topic                filter by type of video (e.g "stream")
     * @param type                 the type
     * @return a list of SimpleVideo objects
     */
    @GET("/api/v2/live")
    Call<List<SimpleVideo>> getLiveVideos(
            @Query("channel_id") String channel_id,
            @Query("id") String id,
            @Query("include") String include,
            @Query("lang") String lang,
            @Query("limit") Integer limit,
            @Query("maxUpcomingHours") Integer maxUpcomingHours,
            @Query("mentioned_channel_id") String mentioned_channel_id,
            @Query("offset") Integer offset,
            @Query("order") String order,
            @Query("org") String org,
            @Query("paginated") String paginated,
            @Query("sort") String sort,
            @Query("status") String status,
            @Query("topic") String topic,
            @Query("type") String type
    );

    /**
     * /api/v2/video endpoint
     *
     * @param channel_id           the YouTube channel id
     * @param id                   the YouTube video id
     * @param include              the include parameters comma seperated
     * @param lang                 a comma separated String of languages (e.g "en,ja")
     * @param limit                the limit for the number of results
     * @param max_upcoming_hours   number of maximum hours to show upcoming videos
     * @param mentioned_channel_id the mentioned channel id of a different channel (for collabs)
     * @param offset               the offset for the number of results
     * @param order                the order (asc, desc)
     * @param org                  the organization of which to get videos for (e.g. "Hololive")
     * @param paginated            paginated field
     * @param sort                 sort by returned field (e.g "start_scheduled")
     * @param status               filter by video status (e.g. "upcoming")
     * @param topic                filter by type of video (e.g "stream")
     * @param type                 the type
     * @return a list of Video objects
     */
    @GET("/api/v2/videos")
    Call<List<Video>> getVideos(
            @Query("channel_id") String channel_id,
            @Query("id") String id,
            @Query("include") String include,
            @Query("lang") String lang,
            @Query("limit") Integer limit,
            @Query("max_upcoming_hours") Integer max_upcoming_hours,
            @Query("mentioned_channel_id") String mentioned_channel_id,
            @Query("offset") Integer offset,
            @Query("order") String order,
            @Query("org") String org,
            @Query("paginated") String paginated,
            @Query("sort") String sort,
            @Query("status") String status,
            @Query("topic") String topic,
            @Query("type") String type
    );

    /**
     * /api/v2/channels endpoint
     *
     * @param channelID the channel id
     * @return the channel
     */
    @GET("/api/v2/channels/{channelID}")
    Call<Channel> getChannel(
            @Path("channelID") String channelID
    );

    /**
     * /api/v2/channels/{channelID}/{type} endpoint
     *
     * @param channelID     the YouTube channel id
     * @param type          the type of video resource ("clips", "videos", "collabs")
     * @param include       the include parameters comma seperated
     * @param lang          a comma separated String of languages (e.g "en,ja")
     * @param limit         the limit for the number of results
     * @param offset        the offset for the number of results
     * @param paginated     paginated field
     * @return list of Videos by channel id
     */
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

    /**
     * /api/v2/users/live endpoint
     *
     * @param channels the channel ids in a comma separated String
     * @return the videos from channels
     */
    @GET("/api/v2/users/live")
    Call<List<Video>> getVideosFromChannels(
            @Query("channels") String channels
    );

    /**
     * /api/v2/videos/{videoID} endpoint
     *
     * @param videoID the YouTube video id
     * @param lang    a comma separated String of languages (e.g "en,ja")
     * @param c       1 will return timestamp comments for the video, 0 will not
     * @return the video
     */
    @GET("/api/v2/videos/{videoID}")
    Call<Video> getVideo(
            @Path("videoID") String videoID,
            @Query("lang") String lang,
            @Query("c") String c
    );

    /**
     * /api/v2/channels endpoint
     *
     * @param limit  the limit for the number of results
     * @param offset the offset for the number of results
     * @param type   the type of channel (e.g "vtuber")
     * @param lang   a comma separated String of languages (e.g "en,ja")
     * @param order  ascending or descending order (e.g "asc")
     * @param org    filter by organization (e.g "Hololive")
     * @param sort   column in which data should be sorted (default is org)
     * @return the channels
     */
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

    /**
     * /api/v2/search/videoSearch endpoint
     */
    @POST("/api/v2/search/videoSearch")
    @Paginated(false)
    Call<List<SimpleVideo>>  postVideoSearch(
            @Body RequestBody videoSearchResult
    );

    @POST("/api/v2/search/videoSearch")
    @Paginated(true)
    Call<VideoSearchResult> postPaginatedVideoSearch(
            @Body RequestBody videoSearchResult
    );


}

