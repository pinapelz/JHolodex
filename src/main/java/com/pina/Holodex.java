package com.pina;

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
    public List<LiveStream> getLiveStreams() throws HolodexException {
        Call<List<LiveStream>> call = service.getLiveStreams("channel,clip");
        return executeCall(call);
    }

    public List<UpcomingStream> getUpcomingStreams() throws HolodexException {
        Call<List<UpcomingStream>> call = service.getUpcomingStreams("channel,clip");
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
