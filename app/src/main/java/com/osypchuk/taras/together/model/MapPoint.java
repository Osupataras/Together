package com.osypchuk.taras.together.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Taras on 06.12.2016.
 */

public class MapPoint {
    @SerializedName("Id")
    int id;
    @SerializedName("Latitude")
    double latitude;
    @SerializedName("Longitude")
    double longitude;
    @SerializedName("Address")
    String address;

    @Override
    public String toString() {
        return "MapPoint{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public MapPoint(String address, int id, double latitude, double longitude) {

        this.address = address;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
