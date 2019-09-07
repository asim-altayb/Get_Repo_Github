package com.example.parsaniahardik.json_parsing_url_retrofit.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    String JSONURL = "https://api.github.com/";

    @GET("users/asim-altayb/repos")
    Call<String> getString();

}
