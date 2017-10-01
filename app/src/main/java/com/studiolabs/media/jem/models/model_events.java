package com.studiolabs.media.jem.models;


public class model_events {
    private String event_id;
    private String event_name;
    private String event_summary;
    private String event_date;
    private String event_venue;
    private String event_time;
    private String event_img;

    public model_events(String event_id, String event_name, String event_summary, String event_date, String event_venue, String event_time, String event_img) {
        this.setEvent_id(event_id);
        this.setEvent_name(event_name);
        this.setEvent_summary(event_summary);
        this.setEvent_date(event_date);
        this.setEvent_venue(event_venue);
        this.setEvent_time(event_time);
        this.setEvent_img(event_img);
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getEvent_summary() {
        return event_summary;
    }

    public void setEvent_summary(String event_summary) {
        this.event_summary = event_summary;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getEvent_venue() {
        return event_venue;
    }

    public void setEvent_venue(String event_venue) {
        this.event_venue = event_venue;
    }

    public String getEvent_time() {
        return event_time;
    }

    public void setEvent_time(String event_time) {
        this.event_time = event_time;
    }

    public String getEvent_img() {
        return event_img;
    }

    public void setEvent_img(String event_img) {
        this.event_img = event_img;
    }
}