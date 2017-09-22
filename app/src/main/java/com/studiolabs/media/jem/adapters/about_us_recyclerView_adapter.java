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

public class about_us_recyclerView_adapter extends RecyclerView.Adapter<about_us_recyclerView_adapter.RecyclerViewHolder> {
    private Context context;
    private ArrayList<model_aboutUs> arrayList =new ArrayList<>();

    public about_us_recyclerView_adapter(Context context, ArrayList<model_aboutUs> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public about_us_recyclerView_adapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout_about_us,parent,false);
        return new RecyclerViewHolder(view,context,arrayList);

    }

    @Override
    public void onBindViewHolder(about_us_recyclerView_adapter.RecyclerViewHolder holder, int position) {
        model_aboutUs about = arrayList.get(position);
        holder.about_personName.setText(about.getName());
        holder.about_personTitle.setText(about.getPosition());
        holder.about_personContent.setText(about.getAboutContent());
        Glide.with(context).load(about.getProfile_pic()).into(holder.about_personImage);
        holder.imageUrl = about.getProfile_pic();

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    static  class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView about_personName, about_personTitle, about_personContent;
        ImageView about_personImage;
        String imageUrl;
        ArrayList<model_aboutUs> arrayList;
        Context context;

        RecyclerViewHolder(View view, Context context, ArrayList<model_aboutUs> arrayList) {
            super(view);
            this.arrayList=arrayList;
            this.context=context;
            view.setOnClickListener(this);
            about_personName=(TextView) view.findViewById(R.id.name_of_person);
            about_personTitle=(TextView)view.findViewById(R.id.pos_of_person);
            about_personContent=(TextView)view.findViewById(R.id.aboutContent);
            about_personImage =(ImageView) view.findViewById(R.id.profileImage);
        }

        @Override
        public void onClick(View view) {
            int position= getAdapterPosition();
            model_aboutUs aboutUs = this.arrayList.get(position);
            Intent intent = new Intent(this.context, aboutUsDetails.class);
            intent.putExtra("about_id",aboutUs.getAboutUs_Id());
            intent.putExtra("about_Name",aboutUs.getName());
            intent.putExtra("about_Title",aboutUs.getPosition());
            intent.putExtra("about_Content",aboutUs.getAboutContent());
            intent.putExtra("about_Image",imageUrl);

            this.context.startActivity(intent);

        }
    }
}
