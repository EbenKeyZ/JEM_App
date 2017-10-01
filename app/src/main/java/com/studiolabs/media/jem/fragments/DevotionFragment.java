package com.studiolabs.media.jem.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.studiolabs.media.jem.BackgroundTask.devotions_Task;
import com.studiolabs.media.jem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DevotionFragment extends Fragment {


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        devotions_Task devotionsTask = new devotions_Task(DevotionFragment.this.getContext());
        devotionsTask.execute();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_devotion, container, false);
    }

}
