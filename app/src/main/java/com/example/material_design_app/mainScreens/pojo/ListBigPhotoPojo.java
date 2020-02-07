package com.example.material_design_app.mainScreens.pojo;

public class ListBigPhotoPojo {

    int photo;
    String title;
    String date;

    public ListBigPhotoPojo(int photo, String title, String date) {
        this.photo = photo;
        this.title = title;
        this.date = date;
    }

    public int getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
