package com.pinapelz;

import com.google.gson.Gson;
import com.pinapelz.datatypes.*;
import com.pinapelz.query.*;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;


/**
 * The class for interacting with the Holodex API
 */
public class Holodex {
    private HolodexService service;
    private int readTimeout = 35;
    private int writeTimeout = 35;

    /**
     * Instantiates a new Holodex with the default base url
     *
     * @param apiKey the api key
     */
    public Holodex(String apiKey) {
        initializeHolodexService(apiKey, "https://holodex.net");
    }

    /**
     * Instantiates a new Holodex with a custom base url
     *
     * @param apiKey  the api key
     * @param baseUrl the base url
     */
    public Holodex(String apiKey, String baseUrl) {
        initializeHolodexService(apiKey, baseUrl);
    }

    private void initializeHolodexService(String apiKey, String baseUrl){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .writeTimeout(writeTimeout, TimeUnit.SECONDS)
                .readTimeout(readTimeout, TimeUnit.SECONDS);
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

    private Holodex setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    private Holodex setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
        return this;
    }

    /**
     * Gets a list of upcoming and/or live SimpleVideos matching the VideoQueryBuilder attributes
     *
     * @param queryBuilder the query builder
     * @return A list of upcoming and/or live SimpleVideos
     * @throws HolodexException the holodex exception
     */
    public List<SimpleVideo> getLiveAndUpcomingVideos(VideoQueryBuilder queryBuilder) throws HolodexException {
        Call<List<SimpleVideo>> call = service.getLiveVideos(queryBuilder.getChannelId(), queryBuilder.getId(),
                queryBuilder.getInclude(), queryBuilder.getLang(),
                queryBuilder.getLimit(), queryBuilder.getMaxUpcomingHours(),
                queryBuilder.getMentionedChannelId(), queryBuilder.getOffset(),
                queryBuilder.getOrder(), queryBuilder.getOrg(),
                queryBuilder.getPaginated(), queryBuilder.getSort(),
                queryBuilder.getStatus(), queryBuilder.getTopic(),
                queryBuilder.getType());
        return executeCall(call);
    }

    /**
     * Gets a list of videos matching the VideoQueryBuilder attributes
     *
     * @param queryBuilder the query builder
     * @return list of videos
     * @throws HolodexException the holodex exception
     */
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

    /**
     * Gets information about a channel when given a channel id
     *
     * @param channelId the channel id
     * @return the Channel
     * @throws HolodexException the holodex exception
     */
    public Channel getChannel(String channelId) throws HolodexException {
        Call<Channel> call = service.getChannel(channelId);
        return executeCall(call);
    }

    /**
     * Gets a list of Videos matching the VideoByVideoIdQueryBuilder attributes for a specific channel
     * Used for when the channel id is known
     *
     * @param query the query
     * @return List of videos matching the query
     * @throws HolodexException the holodex exception
     */
    public List<Video> getVideosByChannelId(VideosByChannelIDQueryBuilder query) throws HolodexException {
        Call<List<Video>> call = service.getVideosByChannelId(query.getChannelId(), query.getType(), query.getInclude(),
                query.getLang(), query.getLimit(), query.getOffset(), query.getPaginated());
        return executeCall(call);

    }

    /**
     * Gets upcoming and live videos from an array of channel ids
     * Response will contain videos from all channels together
     * This should be used when there is a set of channels that need to be queried
     *
     * @param channels the channel ids to get videos from
     * @return List of live and/or upcoming videos where the channel id is the author
     * @throws HolodexException the holodex exception
     */
    public List<Video> getVideosFromChannels(String[] channels) throws HolodexException{
        String channelsString = String.join(",", channels);
        Call<List<Video>> call = service.getVideosFromChannels(channelsString);
        return executeCall(call);
    }

    /**
     * Gets the video matching the VideoByVideoIdQueryBuilder attributes
     *
     * @param query the query
     * @return Video matching the query
     * @throws HolodexException holodex exception
     */
    public Video getVideo(VideoByVideoIdQueryBuilder query) throws HolodexException {
        Call<Video> call = service.getVideo(query.getVideoId(), query.getLang(), query.getC());
        return executeCall(call);
    }

    /**
     * Gets a list of channels the match the ChannelQueryBuilder attributes
     *
     * @param query the query
     * @return List of channels matching the query
     * @throws HolodexException the holodex exception
     */
    public List<Channel> getChannels(ChannelQueryBuilder query) throws HolodexException{
        Call<List<Channel>> call = service.getChannels(query.getLimit(), query.getOffset(), query.getType(),
                query.getLang(), query.getOrder(), query.getOrg(), query.getSort()
        );
        return executeCall(call);
    }

    /**
     * Sends a POST request to search for videos matching the VideoSearchQueryBuilder attributes
     * If the query is paginated, the response will be a VideoSearchResult object
     * If the query is not paginated, the response will be a list of SimpleVideo objects
     * @param query
     * @return
     * @throws HolodexException
     */

    public Object searchVideo(VideoSearchQueryBuilder query) throws HolodexException {
        Map<String, Object> payload = toMap(query);
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),
                new Gson().toJson(payload));
        if(query.isPaginated()) {
            Call<VideoSearchResult> call = service.postPaginatedVideoSearch(body);
            return executeCall(call);
        }
        Call<List<SimpleVideo>> call = service.postVideoSearch(body);
        return executeCall(call);

    }

    /**
     * Sends a POST request to search for comments matching the CommentSearchQueryBuilder attributes
     * If the query is paginated, the response will be a CommentSearchResult object
     * If the query is not paginated, the response will be a list of SimpleCommentVideo objects
     * @param query
     * @return
     * @throws HolodexException
     */
    public Object searchComment(CommentSearchQueryBuilder query) throws HolodexException{
        Map<String, Object> payload = toMap(query);
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),
                new Gson().toJson(payload));
        if(query.isPaginated()) {
            Call<CommentSearchResult> call = service.postPaginatedCommentSearch(body);
            return executeCall(call);
        }
        Call<List<SimpleCommentVideo>> call = service.postCommentSearch(body);
        return executeCall(call);
    }

    private static Map<String, Object> toMap(Object obj) throws HolodexException {
        Map<String, Object> map = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                map.put(field.getName(), value);
            } catch (IllegalAccessException e) {
                throw new HolodexException("Failed to execute API call", e);
            }
        }
        return map;
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
