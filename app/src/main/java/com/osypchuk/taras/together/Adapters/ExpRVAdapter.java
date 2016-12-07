package com.osypchuk.taras.together.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.osypchuk.taras.together.ExpRecycler.RoutesChild;
import com.osypchuk.taras.together.ExpRecycler.RoutesParent;
import com.osypchuk.taras.together.R;

import java.util.List;

/**
 * Created by Taras on 07.12.2016.
 */

public class ExpRVAdapter extends ExpandableRecyclerAdapter<ExpRVAdapter.MyParentViewHolder, ExpRVAdapter.MyChildViewHolder> {
    private LayoutInflater mInflater;

    public ExpRVAdapter(Context context, List<ParentListItem> itemList) {
        super(itemList);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_parent, viewGroup, false);
        return new MyParentViewHolder(view);
    }

    @Override
    public MyChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_child, viewGroup, false);
        return new MyChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(MyParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        RoutesParent routesParent = (RoutesParent) parentListItem;
        parentViewHolder.owner.setImageResource(R.drawable.jaba);
        parentViewHolder.start.setText(routesParent.getStart());
        parentViewHolder.end.setText(routesParent.getEnd());

    }

    @Override
    public void onBindChildViewHolder(MyChildViewHolder childViewHolder, int position, Object childListItem) {
        RoutesChild routesChild = (RoutesChild) childListItem;
        childViewHolder.owner.setText(routesChild.getOwner());
        childViewHolder.startDate.setText(routesChild.getStartDate());
        childViewHolder.passengers.setText(routesChild.getPassengers()+"/"+routesChild.getMaxPassengers());
        childViewHolder.routeType.setText(routesChild.getRouteType());
        childViewHolder.isPrivate.setText(routesChild.getPrivate().toString());


    }

    public class MyParentViewHolder extends ParentViewHolder {

        public TextView start;
        public TextView end;
        public ImageView owner;


        public MyParentViewHolder(View itemView) {
            super(itemView);
            start = (TextView) itemView.findViewById(R.id.start_point);
            end = (TextView) itemView.findViewById(R.id.end_point);
            owner = (ImageView) itemView.findViewById(R.id.owner_image);
        }
    }


    public class MyChildViewHolder extends ChildViewHolder {

        public TextView owner;
        public TextView startDate;
        public TextView passengers;
        public TextView routeType;
        public TextView isPrivate;


        public MyChildViewHolder(View itemView) {
            super(itemView);
            owner = (TextView) itemView.findViewById(R.id.owner_name);
            startDate = (TextView) itemView.findViewById(R.id.time);
            passengers = (TextView) itemView.findViewById(R.id.passengers);
            routeType = (TextView) itemView.findViewById(R.id.route_type);
            isPrivate = (TextView) itemView.findViewById(R.id.is_private);
        }
    }
}
