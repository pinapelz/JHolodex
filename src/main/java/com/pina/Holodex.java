package com.pina;

import com.pina.datatypes.Channel;
import com.pina.datatypes.Video;
import com.pina.query.VideoQueryBuilder;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Holodex {
    private final HolodexService service;

    public Holodex(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://holodex.net")
                .addConverterFactory(JacksonConverterFactory.create())
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
