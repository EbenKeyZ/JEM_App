package com.studiolabs.media.jem.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.studiolabs.media.jem.R;
import com.studiolabs.media.jem.models.model_aboutUs_Images;
import com.studiolabs.media.jem.models.model_events;
import com.studiolabs.media.jem.views.EventDetailsActivity;

import java.util.ArrayList;

public class event_recyclerView_adapter extends RecyclerView.Adapter<event_recyclerView_adapter.RecyclerViewHolder> {
    private Context context;
    private ArrayList<model_events> arrayList =new ArrayList<>();

    public event_recyclerView_adapter(Context context, ArrayList<model_events> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public event_recyclerView_adapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_event,parent,false);
        return new RecyclerViewHolder(view,context,arrayList);

    }

    @Override
    public void onBindViewHolder(event_recyclerView_adapter.RecyclerViewHolder holder, int position) {
        model_events events = arrayList.get(position);

//        holder.image_Caption.setText(events.getEvent_Img());
        holder.event_title.setText(events.getEvent_name());
        holder.event_summary.setText(events.getEvent_summary());
        holder.event_date.setText(events.getEvent_date());
        holder.event_venue.setText(events.getEvent_venue());
        holder.event_time.setText(events.getEvent_time());
        Glide.with(context).load(events.getEvent_img()).into(holder.eventImage);
        holder.imageUrl = events.getEvent_img();

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    static  class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView event_time, event_venue, event_date, event_summary, event_title;
        ImageView eventImage;
        String imageUrl;
        ArrayList<model_events> arrayList;
        Context context;

        RecyclerViewHolder(View view, Context context, ArrayList<model_events> arrayList) {
            super(view);
            this.arrayList=arrayList;
            this.context=context;
            view.setOnClickListener(this);
            event_title=(TextView)view.findViewById(R.id.event_title);
            event_summary=(TextView)view.findViewById(R.id.event_summary);
            event_date=(TextView)view.findViewById(R.id.event_date);
            event_venue=(TextView)view.findViewById(R.id.event_venue);
            event_time=(TextView)view.findViewById(R.id.event_time);
            eventImage =(ImageView) view.findViewById(R.id.eventImage);
        }

        @Override
        public void onClick(View view) {
            int position= getAdapterPosition();
            model_events events = this.arrayList.get(position);
            Intent intent = new Intent(this.context, EventDetailsActivity.class);
            intent.putExtra("event_id",events.getEvent_id());
            intent.putExtra("event_name",events.getEvent_name());
            intent.putExtra("event_summary",events.getEvent_summary());
            intent.putExtra("event_date",events.getEvent_date());
            intent.putExtra("event_venue",events.getEvent_venue());
            intent.putExtra("event_time",events.getEvent_time());
            intent.putExtra("event_image",imageUrl);

            this.context.startActivity(intent);

        }
    }
}
