package com.example.material_design_app.mainScreens.pojo;

public class FeedPojo {

    String postUserName;
    String postDate;
    int postUserAvatar;
    int postPhoto;
    String postTitle;

    public FeedPojo(String postUserName, String postDate, int postUserAvatar, int postPhoto, String postTitle) {
        this.postUserName = postUserName;
        this.postDate = postDate;
        this.postUserAvatar = postUserAvatar;
        this.postPhoto = postPhoto;
        this.postTitle = postTitle;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public String getPostDate() {
        return postDate;
    }

    public int getPostUserAvatar() {
        return postUserAvatar;
    }

    public int getPostPhoto() {
        return postPhoto;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public void setPostUserAvatar(int postUserAvatar) {
        this.postUserAvatar = postUserAvatar;
    }

    public void setPostPhoto(int postPhoto) {
        this.postPhoto = postPhoto;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
}
