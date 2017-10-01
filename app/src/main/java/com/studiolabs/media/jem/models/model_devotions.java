package com.studiolabs.media.jem.models;


public class model_devotions {
    private String dev_id;
    private String dev_title;
    private String dev_details;
    private String dev_img;
    private String dev_dateShow;

    public model_devotions(String dev_id, String dev_title, String dev_details, String dev_img, String dev_dateShow) {
        this.setDev_id(dev_id);
        this.setDev_title(dev_title);
        this.setDev_details(dev_details);
        this.setDev_img(dev_img);
        this.setDev_dateShow(dev_dateShow);
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getDev_title() {
        return dev_title;
    }

    public void setDev_title(String dev_title) {
        this.dev_title = dev_title;
    }

    public String getDev_details() {
        return dev_details;
    }

    public void setDev_details(String dev_details) {
        this.dev_details = dev_details;
    }

    public String getDev_img() {
        return dev_img;
    }

    public void setDev_img(String dev_img) {
        this.dev_img = dev_img;
    }

    public String getDev_dateShow() {
        return dev_dateShow;
    }

    public void setDev_dateShow(String dev_dateShow) {
        this.dev_dateShow = dev_dateShow;
    }
}

//    public model_devotions(String dev_id, String dev_title, String dev_details, String dev_img, String dev_dateShow) {
//        this.dev_id(dev_id);
//        this.dev_title(dev_title);
//        this.dev_details(dev_details);
//        this.dev_img(dev_img);
//        this.dev_dateShow(dev_dateShow);
//    }
//
//    public model_devotions(String event_id, String event_name, String event_summary, String event_date, String event_venue, String event_time, String event_img) {
//        this.setEvent_id(event_id);
//        this.setEvent_name(event_name);
//        this.setEvent_summary(event_summary);
//        this.setEvent_date(event_date);
//        this.setEvent_venue(event_venue);
//        this.setEvent_time(event_time);
//        this.setEvent_img(event_img);
//    }
//
//    public String getEvent_id() {
//        return event_id;
//    }
//
//    public void setEvent_id(String event_id) {
//        this.event_id = event_id;
//    }
//
//    public String getEvent_name() {
//        return event_name;
//    }
//
//    public void setEvent_name(String event_name) {
//        this.event_name = event_name;
//    }
//
//    public String getEvent_summary() {
//        return event_summary;
//    }
//
//    public void setEvent_summary(String event_summary) {
//        this.event_summary = event_summary;
//    }
//
//    public String getEvent_date() {
//        return event_date;
//    }
//
//    public void setEvent_date(String event_date) {
//        this.event_date = event_date;
//    }
//
//    public String getEvent_venue() {
//        return event_venue;
//    }
//
//    public void setEvent_venue(String event_venue) {
//        this.event_venue = event_venue;
//    }
//
//    public String getEvent_time() {
//        return event_time;
//    }
//
//    public void setEvent_time(String event_time) {
//        this.event_time = event_time;
//    }
//
//    public String getEvent_img() {
//        return event_img;
//    }
//
//    public void setEvent_img(String event_img) {
//        this.event_img = event_img;
//    }
//}