package com.osypchuk.taras.together.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Taras on 05.12.2016.
 */

public class ApiClient {

    private static Retrofit retrofit = null;
    private static final String BASE_URL = "http://together24.azurewebsites.net/";


    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
