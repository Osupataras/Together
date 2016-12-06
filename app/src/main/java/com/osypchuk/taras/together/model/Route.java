package com.osypchuk.taras.together.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Taras on 05.12.2016.
 */

public class Route {
    @SerializedName("Id")
    int id;
    @SerializedName("StartDate")
    String startDate;
    @SerializedName("Passengers")
    int passengers;
    @SerializedName("MaxPassengers")
    int maxPassengers;
    @SerializedName("RouteType")
    String routeType;
    @SerializedName("IsPrivate")
    Boolean isPrivate;
    @SerializedName("Owner")
    Owner owner;
    @SerializedName("StartPoint")
    MapPoint startPoint;
    @SerializedName("EndPoint")
    MapPoint endPoint;


    @Override
    public String
    toString() {
        return "Route{" +
                "endPoint=" + endPoint +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", passengers=" + passengers +
                ", maxPassengers=" + maxPassengers +
                ", routeType='" + routeType + '\'' +
                ", isPrivate=" + isPrivate +
                ", owner=" + owner +
                ", startPoint=" + startPoint +
                '}';
    }

    public MapPoint getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(MapPoint endPoint) {
        this.endPoint = endPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public MapPoint getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(MapPoint startPoint) {
        this.startPoint = startPoint;
    }

    public Route(MapPoint endPoint, int id, Boolean isPrivate, int maxPassengers, Owner owner, int passengers, String routeType, String startDate, MapPoint startPoint) {

        this.endPoint = endPoint;
        this.id = id;
        this.isPrivate = isPrivate;
        this.maxPassengers = maxPassengers;
        this.owner = owner;
        this.passengers = passengers;
        this.routeType = routeType;
        this.startDate = startDate;
        this.startPoint = startPoint;
    }
}
