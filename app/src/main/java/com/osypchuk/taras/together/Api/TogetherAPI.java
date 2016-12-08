package com.osypchuk.taras.together.Api;

import com.osypchuk.taras.together.model.Route;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

/**
 * Created by Taras on 05.12.2016.
 */

public interface TogetherAPI {

    @GET("api/routes")
    Call<List<Route>> getRoutesList();

    @POST("api/routes")
    Call<Route> setRout(@Body Route route);

    @GET("api/routes/{id}")
    Call<Route> getRout(@Path("id") int id);

    @PUT("api/routes/{id}")
    Call<Route> updateRout(@Path("id") int id,
                          @Part RequestBody startDay,
                          @Part RequestBody passengers,
                          @Part RequestBody routeType,
                          @Part RequestBody isPrivate,
                          @Part RequestBody owner,
                          @Part RequestBody startPoint,
                          @Part RequestBody endPoint);

    @DELETE("api/routes/{id}")
    Call<Void> deleteRout(@Path("id") int id);

}
