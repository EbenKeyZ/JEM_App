package com.studiolabs.media.jem.views;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.studiolabs.media.jem.BackgroundTask.aboutUs_Images_Task;
import com.studiolabs.media.jem.R;

public class aboutUsDetails extends AppCompatActivity {
    Context context;
    TextView fullName,title, Content, headName;
    RecyclerView recyclerView;
    public static String aboutId_Value;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_details);

        toolbar = (Toolbar) findViewById(R.id.nav_action);
        fullName = (TextView)findViewById(R.id.fullName_tv);
        headName = (TextView)findViewById(R.id.headName_tv);
        title = (TextView)findViewById(R.id.title_tv);
        Content = (TextView)findViewById(R.id.Content_tv);
        recyclerView=(RecyclerView)findViewById(R.id.image_rec_list);

        aboutId_Value = getIntent().getStringExtra("about_id");
        fullName.setText(getIntent().getStringExtra("about_Name"));
        title.setText(getIntent().getStringExtra("about_Title"));
        Content.setText(getIntent().getStringExtra("about_Content"));
        headName.setText(getIntent().getStringExtra("about_Name"));



        aboutUs_Images_Task aboutUsTask = new aboutUs_Images_Task(this);
        aboutUsTask.execute();
    }
}
