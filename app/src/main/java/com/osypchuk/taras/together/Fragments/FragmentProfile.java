package com.osypchuk.taras.together.Fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.osypchuk.taras.together.Api.ApiClient;
import com.osypchuk.taras.together.Api.TogetherAPI;
import com.osypchuk.taras.together.R;
import com.osypchuk.taras.together.model.MapPoint;
import com.osypchuk.taras.together.model.Owner;
import com.osypchuk.taras.together.model.Route;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Taras on 05.12.2016.
 */

public class FragmentProfile extends Fragment {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD/HH:mm:ss.SS");
    Date date = new Date();

    public FragmentProfile() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        final EditText start = (EditText) view.findViewById(R.id.start);
        final EditText end = (EditText) view.findViewById(R.id.end);
        final EditText capacity = (EditText) view.findViewById(R.id.capacity);
        final EditText privat = (EditText) view.findViewById(R.id.privat);

        final EditText delete = (EditText) view.findViewById(R.id.delete);


        FloatingActionButton fabAddRoute = (FloatingActionButton) view.findViewById(R.id.fab_add_route);
        fabAddRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TogetherAPI togetherAPI = ApiClient.getRetrofit().create(TogetherAPI.class);
                Route route = new Route(
                        new MapPoint(29, 35.00, 25.00, end.getText().toString()),
                        25,
                        Boolean.getBoolean(privat.getText().toString()),
                        Integer.parseInt(capacity.getText().toString()),
                        new Owner("Taras", 2, "Osypchuk"),
                        0,
                        "Non-Standart",
                        dateFormat.format(date),
                        new MapPoint(29, 35.00, 25.00, start.getText().toString())
                );
                Call<Route> setRoute = togetherAPI.setRout(route);
                setRoute.enqueue(new Callback<Route>() {
                    @Override
                    public void onResponse(Call<Route> call, Response<Route> response) {
                        System.out.println("Yes");

                    }

                    @Override
                    public void onFailure(Call<Route> call, Throwable t) {
                        System.out.println("No");

                    }
                });
            }
        });

        FloatingActionButton fabDelRoute = (FloatingActionButton) view.findViewById(R.id.fab_delete_route);
        fabDelRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TogetherAPI togetherAPI = ApiClient.getRetrofit().create(TogetherAPI.class);
                Call<Void> deleteRoute = togetherAPI.deleteRout(Integer.parseInt(delete.getText().toString()));
                deleteRoute.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        System.out.println(""+response.code());
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {


                    }
                });


            }
        });
        return view;
    }
}
