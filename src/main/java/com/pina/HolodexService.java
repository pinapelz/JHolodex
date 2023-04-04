package com.pina;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HolodexService {
    @GET("/api/v2/live")
    Call<List<LiveStream>> getLiveStreams(
            @Query("channel_id") String channel_id,
            @Query("id") String id,
            @Query("include") String include,
            @Query("lang") String lang,
            @Query("limit") Integer limit,
            @Query("max_upcoming_hours") Integer offset,
            @Query("mentioned_channel_id") String mentioned_channel_id,
            @Query("offset") Integer max_upcoming_hours,
            @Query("order") String order,
            @Query("org") String org,
            @Query("paginated") String paginated,
            @Query("sort") String sort,
            @Query("status") String status,
            @Query("topic") String topic,
            @Query("type") String type
    );

    @GET("/api/v2/upcoming")
    Call<List<UpcomingStream>> getUpcomingStreams(@Query("include") String include);

}

