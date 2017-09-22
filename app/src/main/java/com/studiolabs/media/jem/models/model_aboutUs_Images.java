package com.studiolabs.media.jem.models;


public class model_aboutUs_Images {
    private String image_id;
    private String aboutPerson_id;
    private String Caption;
    private String PictureName;
    private String status;

    public model_aboutUs_Images(String image_id, String aboutPerson_id, String Caption, String PictureName, String status) {
        this.setImage_id(image_id);
        this.setAboutPerson_id(aboutPerson_id);
        this.setCaption(Caption);
        this.setPictureName(PictureName);
        this.setStatus(status);
    }

    public String getImage_id() {
        return image_id;
    }

    private void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getAboutPerson_id() {
        return aboutPerson_id;
    }

    private void setAboutPerson_id(String aboutPerson_id) {
        this.aboutPerson_id = aboutPerson_id;
    }

    public String getCaption() {
        return Caption;
    }

    private void setCaption(String Caption) {
        this.Caption = Caption;
    }

    public String getPictureName() {
        return PictureName;
    }

    private void setPictureName(String PictureName) {
        this.PictureName = PictureName;
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }
}