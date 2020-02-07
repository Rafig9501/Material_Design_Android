package com.example.material_design_app.mainScreens.pojo;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ExpandableParentPojo extends ExpandableGroup<ExpandableChildPojo> {

    int userPhoto;
    String userName;
    String userLocation;

    public ExpandableParentPojo(int userPhoto, String userName, String userLocation,String title, List<ExpandableChildPojo> items) {
        super(title, items);
        this.userPhoto = userPhoto;
        this.userName = userName;
        this.userLocation = userLocation;
    }

    public int getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(int userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }
}
