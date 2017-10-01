package com.studiolabs.media.jem.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.studiolabs.media.jem.R;
import com.studiolabs.media.jem.models.model_devotions;

import java.util.ArrayList;

public class devotions_recyclerView_adapter extends RecyclerView.Adapter<devotions_recyclerView_adapter.RecyclerViewHolder> {
    private Context context;
    private ArrayList<model_devotions> arrayList =new ArrayList<>();

    public devotions_recyclerView_adapter(Context context, ArrayList<model_devotions> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public devotions_recyclerView_adapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_devotion,parent,false);
        return new RecyclerViewHolder(view,context,arrayList);

    }

    @Override
    public void onBindViewHolder(devotions_recyclerView_adapter.RecyclerViewHolder holder, int position) {
        model_devotions devotions = arrayList.get(position);

//        holder.image_Caption.setText(events.getEvent_Img());
        holder.dev_title.setText(devotions.getDev_title());
        holder.dev_details.setText(devotions.getDev_details());
        holder.dev_dateShow.setText(devotions.getDev_dateShow());
        Glide.with(context).load(devotions.getDev_img()).into(holder.dev_image);
        holder.imageUrl = devotions.getDev_img();

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    static  class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView dev_dateShow, dev_details, dev_title;
        ImageView dev_image;
        String imageUrl;
        ArrayList<model_devotions> arrayList;
        Context context;

        RecyclerViewHolder(View view, Context context, ArrayList<model_devotions> arrayList) {
            super(view);
            this.arrayList=arrayList;
            this.context=context;
//            view.setOnClickListener(this);
            dev_title=(TextView)view.findViewById(R.id.dev_title);
            dev_details=(TextView)view.findViewById(R.id.dev_details);
            dev_dateShow=(TextView)view.findViewById(R.id.dev_dateShow);
            dev_image =(ImageView) view.findViewById(R.id.Image);
        }

//        @Override
//        public void onClick(View view) {
//            int position= getAdapterPosition();
//            model_aboutUs_Images aboutUsImages = this.arrayList.get(position);
//            Intent intent = new Intent(this.context, aboutUsDetails.class);
//            intent.putExtra("about_id",aboutUsImages.getAboutUs_Id());
//            intent.putExtra("about_Name",aboutUsImages.getName());
//            intent.putExtra("about_Title",aboutUsImages.getPosition());
//            intent.putExtra("about_Content",aboutUsImages.getAboutContent());
//            intent.putExtra("about_Image",imageUrl);
//
//            this.context.startActivity(intent);
//
//        }
    }
}
