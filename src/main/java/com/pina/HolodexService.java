package com.pina;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HolodexService {
    @GET("/api/v2/live")
    Call<List<LiveStream>> getLiveStreams(@Query("include") String include);

    @GET("/api/v2/upcoming")
    Call<List<UpcomingStream>> getUpcomingStreams(@Query("include") String include);

}

