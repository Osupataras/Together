package com.osypchuk.taras.together.ExpRecycler;

import com.osypchuk.taras.together.model.Route;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taras on 08.12.2016.
 */

public class ChildensGenerator {

    public List<RoutesChild> getChildrens (List<Route> routes, List<RoutesParent> routesParentsList,RoutesParent routesParent){
        List<RoutesChild> routesChildList = new ArrayList<>();
        routesChildList.add(new RoutesChild(
                routes.get(routesParentsList.indexOf(routesParent)).getId(),
                routes.get(routesParentsList.indexOf(routesParent)).getPrivate(),
                routes.get(routesParentsList.indexOf(routesParent)).getMaxPassengers(),
                routes.get(routesParentsList.indexOf(routesParent)).getOwner().getFirstName()
                        + routes.get(routesParentsList.indexOf(routesParent)).getOwner().getLastName(),
                routes.get(routesParentsList.indexOf(routesParent)).getPassengers(),
                routes.get(routesParentsList.indexOf(routesParent)).getRouteType(),
                routes.get(routesParentsList.indexOf(routesParent)).getStartDate()));
        return routesChildList;
    }


}
