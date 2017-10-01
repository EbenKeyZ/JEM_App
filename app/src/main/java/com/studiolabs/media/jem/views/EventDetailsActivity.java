package com.studiolabs.media.jem.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.studiolabs.media.jem.R;

public class EventDetailsActivity extends AppCompatActivity {

    Context context;
    TextView eventName, eventSummary,eventTime, eventDate, eventVenue;
    ImageView eventImage;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        eventName=(TextView) findViewById(R.id.eventTitle);
        eventSummary=(TextView) findViewById(R.id.eventSummary);
        eventDate=(TextView) findViewById(R.id.eventDate);
        eventVenue=(TextView) findViewById(R.id.eventVenue);
        eventTime=(TextView) findViewById(R.id.eventTime);
        eventImage=(ImageView)findViewById(R.id.eventImage);

//         = getIntent().getStringExtra("event_id");
        eventName.setText(getIntent().getStringExtra("event_name"));
        eventSummary.setText(Html.fromHtml(getIntent().getStringExtra("event_summary")));
        eventDate.setText(getIntent().getStringExtra("event_date"));
        eventVenue.setText(getIntent().getStringExtra("event_venue"));
        eventTime.setText(getIntent().getStringExtra("event_time"));

String iImage=getIntent().getStringExtra("event_image");
        Glide.with(this).load(iImage)
                .placeholder(R.drawable.loading)
                .error(R.drawable.loading)
                .into(eventImage);
    }
}
