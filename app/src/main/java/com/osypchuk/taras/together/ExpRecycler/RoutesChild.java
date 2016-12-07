package com.osypchuk.taras.together.ExpRecycler;

/**
 * Created by Taras on 07.12.2016.
 */

public class RoutesChild {

    int id;
    String startDate;
    int passengers;
    int maxPassengers;
    String routeType;
    Boolean isPrivate;
    String owner;

    public RoutesChild(int id, Boolean isPrivate, int maxPassengers, String owner, int passengers, String routeType, String startDate) {
        this.id = id;
        this.isPrivate = isPrivate;
        this.maxPassengers = maxPassengers;
        this.owner = owner;
        this.passengers = passengers;
        this.routeType = routeType;
        this.startDate = startDate;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
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
}
