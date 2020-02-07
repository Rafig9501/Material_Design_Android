package com.example.material_design_app.mainScreens.pojo;

public class ListSmallPhotoPojo {

    int photo;
    String text;
    String date;

    public ListSmallPhotoPojo(int photo, String text, String date) {
        this.photo = photo;
        this.text = text;
        this.date = date;
    }

    public int getPhoto() {
        return photo;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
