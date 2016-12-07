package com.osypchuk.taras.together.ExpRecycler;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

/**
 * Created by Taras on 07.12.2016.
 */

public class RoutesParent implements ParentListItem {
    String start;
    String end;

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    List<RoutesChild> route;

    public RoutesParent(String start, String end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<RoutesChild> getChildItemList() {
        return route;
    }

    public void setRoute(List<RoutesChild> route) {
        this.route = route;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
