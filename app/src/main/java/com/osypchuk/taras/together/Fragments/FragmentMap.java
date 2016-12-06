package com.osypchuk.taras.together.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.osypchuk.taras.together.R;

import ru.yandex.yandexmapkit.MapController;
import ru.yandex.yandexmapkit.MapView;
import ru.yandex.yandexmapkit.utils.GeoPoint;

/**
 * Created by Taras on 04.12.2016.
 */

public class FragmentMap extends Fragment {
    public FragmentMap() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        MapView mapView = (MapView) view.findViewById(R.id.map);
        MapController mapController = mapView.getMapController();
        mapController.setPositionAnimationTo(new GeoPoint(50.454850,30.514480));
        return view;
    }
}
