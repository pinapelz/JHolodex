package com.pina;

import com.pina.datatypes.Channel;
import com.pina.datatypes.Video;
import com.pina.query.ChannelQueryBuilder;
import com.pina.query.VideoMetadataQueryBuilder;
import com.pina.query.VideoQueryBuilder;
import com.pina.query.VideosByChannelIDQueryBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Holodex {
    private HolodexService service;

    public Holodex(String apiKey) {
        initializeHolodexService(apiKey, "https://holodex.net");
    }

    public Holodex(String apiKey, String baseUrl) {
        // purely for unit testing
        initializeHolodexService(apiKey, baseUrl);
    }

    private void initializeHolodexService(String apiKey, String baseUrl){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(chain -> {
            Request original = chain.request();
            Request request = original.newBuilder()
                    .header("X-APIKEY", apiKey)
                    .method(original.method(), original.body())
                    .build();
            return chain.proceed(request);
        });
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .client(httpClient.build())
                .build();
        service = retrofit.create(HolodexService.class);
    }

    public List<Video> getLiveVideos(VideoQueryBuilder queryBuilder) throws HolodexException {
        Call<List<Video>> call = service.getLiveVideos(queryBuilder.getChannelId(), queryBuilder.getId(),
                queryBuilder.getInclude(), queryBuilder.getLang(),
                queryBuilder.getLimit(), queryBuilder.getMaxUpcomingHours(),
                queryBuilder.getMentionedChannelId(), queryBuilder.getOffset(),
                queryBuilder.getOrder(), queryBuilder.getOrg(),
                queryBuilder.getPaginated(), queryBuilder.getSort(),
                queryBuilder.getStatus(), queryBuilder.getTopic(),
                queryBuilder.getType());
        return executeCall(call);
    }

    public List<Video> getVideos(VideoQueryBuilder queryBuilder) throws HolodexException {
        Call<List<Video>> call = service.getVideos(queryBuilder.getChannelId(), queryBuilder.getId(),
                queryBuilder.getInclude(), queryBuilder.getLang(),
                queryBuilder.getLimit(), queryBuilder.getMaxUpcomingHours(),
                queryBuilder.getMentionedChannelId(), queryBuilder.getOffset(),
                queryBuilder.getOrder(), queryBuilder.getOrg(),
                queryBuilder.getPaginated(), queryBuilder.getSort(),
                queryBuilder.getStatus(), queryBuilder.getTopic(),
                queryBuilder.getType());
        return executeCall(call);
    }

    public Channel getChannel(String channelId) throws HolodexException {
        Call<Channel> call = service.getChannel(channelId);
        return executeCall(call);
    }

    public List<Video> getVideosByChannelId(VideosByChannelIDQueryBuilder query) throws HolodexException {
        Call<List<Video>> call = service.getVideosByChannelId(query.getChannelId(), query.getType(), query.getInclude(),
                query.getLang(), query.getLimit(), query.getOffset(), query.getPaginated());
        return executeCall(call);

    }

    public List<Video> getVideosFromChannels(String[] channels) throws HolodexException{
        String channelsString = String.join(",", channels);
        Call<List<Video>> call = service.getVideosFromChannels(channelsString);
        return executeCall(call);
    }

    public Video getVideo(VideoMetadataQueryBuilder query) throws HolodexException {
        Call<Video> call = service.getVideo(query.getVideoId(), query.getLang(), query.getC());
        return executeCall(call);
    }

    public List<Channel> getChannels(ChannelQueryBuilder query) throws HolodexException{
        Call<List<Channel>> call = service.getChannels(query.getLimit(), query.getOffset(), query.getType(),
                query.getLang(), query.getOrder(), query.getOrg(), query.getSort()
        );
        return executeCall(call);
    }


    private <T> T executeCall(Call<T> call) throws HolodexException {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                throw new HolodexException("API returned error: " + response.code());
            }
        } catch (IOException e) {
            System.out.println(e);
            throw new HolodexException("Failed to execute API call", e);
        }
    }
}
