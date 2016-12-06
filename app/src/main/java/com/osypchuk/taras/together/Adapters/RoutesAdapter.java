package com.osypchuk.taras.together.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.osypchuk.taras.together.R;
import com.osypchuk.taras.together.model.Route;

import java.util.List;

/**
 * Created by Taras on 06.12.2016.
 */

public class RoutesAdapter extends RecyclerView.Adapter<RoutesAdapter.RoutesViewHolder> {
    private List<Route> routes;

    public RoutesAdapter(List<Route> routes) {
        this.routes = routes;
    }


    @Override
    public RoutesAdapter.RoutesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RoutesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RoutesAdapter.RoutesViewHolder holder, int position) {
        if (routes.get(position).getEndPoint() != null && routes.get(position).getStartPoint() != null) {
            holder.image.setImageResource(R.drawable.jaba);
            holder.startPoint.setText(routes.get(position).getStartPoint().getAddress());
            holder.endPoint.setText(routes.get(position).getEndPoint().getAddress());
        }

    }

    @Override
    public int getItemCount() {
        return routes.size();
    }


    public class RoutesViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView startPoint;
        TextView endPoint;

        public RoutesViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.owner_image);
            startPoint = (TextView) itemView.findViewById(R.id.start_point);
            endPoint = (TextView) itemView.findViewById(R.id.end_point);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                                        
                }
            });

        }
    }
}
