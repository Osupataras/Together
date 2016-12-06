package com.osypchuk.taras.together.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Taras on 05.12.2016.
 */

public class Owner {
    @SerializedName("Id")
    int Id;
    @SerializedName("FirstName")
    String FirstName;
    @SerializedName("LastName")
    String LastName;

    @Override
    public String toString() {
        return "Owner{" +
                "FirstName='" + FirstName + '\'' +
                ", Id=" + Id +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Owner(String firstName, int id, String lastName) {

        FirstName = firstName;
        Id = id;
        LastName = lastName;
    }
}
