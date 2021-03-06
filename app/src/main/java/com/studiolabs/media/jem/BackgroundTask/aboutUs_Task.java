package com.studiolabs.media.jem.BackgroundTask;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.studiolabs.media.jem.R;
//import com.studiolabs.media.jem.adapters.about_us_recyclerView_adapter;
import com.studiolabs.media.jem.adapters.about_us_recyclerView_adapter;
import com.studiolabs.media.jem.controllers.Utils;
import com.studiolabs.media.jem.models.model_aboutUs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class aboutUs_Task extends AsyncTask<Void, model_aboutUs, Void> {
    private Context ctx;
    private Activity activity;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private RecyclerView.Adapter adapter;
    private ProgressDialog progressDialog;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<model_aboutUs> arrayList = new ArrayList<>();

    public aboutUs_Task(Context ctx) {
        this.ctx = ctx;
        activity = (Activity) ctx;
    }

    private String json_string = Utils.SHOW_ABOUT_US;

    @Override
    protected void onPreExecute() {
        recyclerView = (RecyclerView)activity.findViewById(R.id.aboutUsDetails_recList);
        gridLayoutManager = new GridLayoutManager(this.ctx, 1);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);

        adapter = new about_us_recyclerView_adapter(this.ctx, arrayList);
        recyclerView.setAdapter(adapter);


        recyclerView.setItemAnimator(new DefaultItemAnimator());

        progressDialog = new ProgressDialog(ctx);
        progressDialog.setTitle("Please Wait...");
        progressDialog.setMessage("loading..");
        progressDialog.show();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        progressDialog.dismiss();
    }

    @Override
    protected void onProgressUpdate(model_aboutUs... values) {
        arrayList.add(values[0]);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL(json_string);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            httpURLConnection.disconnect();
            String json_string = stringBuilder.toString().trim();
            JSONObject jsonObject = new JSONObject(json_string);
            JSONArray jsonArray = jsonObject.getJSONArray("server_response");

            int count = 0;
            while (count < jsonArray.length()) {
                JSONObject JO = jsonArray.getJSONObject(count);
                count++;

                model_aboutUs about = new model_aboutUs(
                        JO.getString("about_id"),
                        JO.getString("about_Name"),
                        JO.getString("about_Title"),
                        JO.getString("about_Image"),
                        JO.getString("about_Content"));

                publishProgress(about);
                Thread.sleep(50);
            }

            Log.d("JSON STRING", json_string);

        } catch (IOException | JSONException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
