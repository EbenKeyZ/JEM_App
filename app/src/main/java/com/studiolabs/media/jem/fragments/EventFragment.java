package com.studiolabs.media.jem.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.studiolabs.media.jem.BackgroundTask.event_Task;
import com.studiolabs.media.jem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        event_Task eventTask = new event_Task(EventFragment.this.getContext());
        eventTask.execute();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event, container, false);
    }

}
