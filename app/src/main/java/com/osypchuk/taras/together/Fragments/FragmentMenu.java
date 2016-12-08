package com.osypchuk.taras.together.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.osypchuk.taras.together.Adapters.ExpRVAdapter;
import com.osypchuk.taras.together.Api.ApiClient;
import com.osypchuk.taras.together.Api.TogetherAPI;
import com.osypchuk.taras.together.ExpRecycler.ChildensGenerator;
import com.osypchuk.taras.together.ExpRecycler.RoutesChild;
import com.osypchuk.taras.together.ExpRecycler.RoutesParent;
import com.osypchuk.taras.together.R;
import com.osypchuk.taras.together.model.Route;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Taras on 04.12.2016.
 */

public class FragmentMenu extends Fragment {
    public FragmentMenu() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TogetherAPI togetherAPI = ApiClient.getRetrofit().create(TogetherAPI.class);
        Call<List<Route>> callRoutes = togetherAPI.getRoutesList();
        callRoutes.enqueue(new Callback<List<Route>>() {
            @Override
            public void onResponse(Call<List<Route>> call, Response<List<Route>> response) {
                List<Route> routes = response.body();

                RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rv);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
                List<RoutesParent> routesParentsList = new ArrayList<RoutesParent>();
                List<ParentListItem> parentListItems = new ArrayList<>();

                for (int i = 0; i < routes.size(); i++) {

                    if (routes.get(i).getEndPoint() != null && routes.get(i).getStartPoint() != null) {
                        RoutesParent routesParent = new RoutesParent(
                                routes.get(i).getEndPoint().getAddress(),
                                routes.get(i).getStartPoint().getAddress());
                        routesParentsList.add(routesParent);

                    } else {
                        RoutesParent routesParent = new RoutesParent("null", "null");
                        routesParentsList.add(routesParent);
                    }

                }

                for (RoutesParent routesParent : routesParentsList) {
                    ChildensGenerator childensGenerator = new ChildensGenerator();
                    List<RoutesChild> routesChildList = childensGenerator.getChildrens(
                            routes,routesParentsList,routesParent);
                    recyclerView.setAdapter(new ExpRVAdapter(getContext(), parentListItems));
                    routesParent.setRoute(routesChildList);
                    parentListItems.add(routesParent);
                }
            }


            @Override
            public void onFailure(Call<List<Route>> call, Throwable t) {

            }
        });


        return inflater.inflate(R.layout.fragment_menu, container, false);
    }
}
