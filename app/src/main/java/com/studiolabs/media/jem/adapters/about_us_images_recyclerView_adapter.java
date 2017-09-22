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
import com.studiolabs.media.jem.models.model_aboutUs;
import com.studiolabs.media.jem.models.model_aboutUs_Images;
import com.studiolabs.media.jem.views.aboutUsDetails;

import java.util.ArrayList;

public class about_us_images_recyclerView_adapter extends RecyclerView.Adapter<about_us_images_recyclerView_adapter.RecyclerViewHolder> {
    private Context context;
    private ArrayList<model_aboutUs_Images> arrayList =new ArrayList<>();

    public about_us_images_recyclerView_adapter(Context context, ArrayList<model_aboutUs_Images> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public about_us_images_recyclerView_adapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_images,parent,false);
        return new RecyclerViewHolder(view,context,arrayList);

    }

    @Override
    public void onBindViewHolder(about_us_images_recyclerView_adapter.RecyclerViewHolder holder, int position) {
        model_aboutUs_Images aboutImages = arrayList.get(position);

        holder.image_Caption.setText(aboutImages.getCaption());
        Glide.with(context).load(aboutImages.getPictureName()).into(holder.about_personImage);
        holder.imageUrl = aboutImages.getPictureName();

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    static  class RecyclerViewHolder extends RecyclerView.ViewHolder{
//        TextView about_personName, about_personTitle, about_personContent;
        TextView image_Caption;
        ImageView about_personImage;
        String imageUrl;
        ArrayList<model_aboutUs_Images> arrayList;
        Context context;

        RecyclerViewHolder(View view, Context context, ArrayList<model_aboutUs_Images> arrayList) {
            super(view);
            this.arrayList=arrayList;
            this.context=context;
//            view.setOnClickListener(this);
//            about_personName=(TextView) view.findViewById(R.id.name_of_person);
//            about_personTitle=(TextView)view.findViewById(R.id.pos_of_person);
            image_Caption=(TextView)view.findViewById(R.id.imageCaption);
            about_personImage =(ImageView) view.findViewById(R.id.profileImageAbt);
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
