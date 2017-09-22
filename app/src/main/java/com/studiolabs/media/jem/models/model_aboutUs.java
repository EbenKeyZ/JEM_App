package com.studiolabs.media.jem.models;


public class model_aboutUs {
    private String aboutUs_Id;
    private String Name;
    private String Position;
    private String profile_pic;
    private String aboutContent;

    public model_aboutUs(String aboutUs_Id, String Name, String Position, String profile_pic, String aboutContent ){
        this.setAboutUs_Id(aboutUs_Id);
        this.setName(Name);
        this.setPosition(Position);
        this.setProfile_pic(profile_pic);
        this.setAboutContent(aboutContent);
    }

    public String getAboutUs_Id() {
        return aboutUs_Id;
    }

    private void setAboutUs_Id(String aboutUs_Id) {
        this.aboutUs_Id = aboutUs_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPosition() {
        return Position;
    }

    private void setPosition(String position) {
        this.Position = position;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    private void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getAboutContent() {
        return aboutContent;
    }

    private void setAboutContent(String aboutContent) {
        this.aboutContent = aboutContent;
    }



}
