package com.studiolabs.media.jem.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.studiolabs.media.jem.BackgroundTask.aboutUs_Task;
import com.studiolabs.media.jem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        aboutUs_Task aboutUsTask = new aboutUs_Task(AboutUsFragment.this.getContext());
        aboutUsTask.execute();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView2 = inflater.inflate(R.layout.fragment_about_us, container, false);
        return rootView2;
    }

}
