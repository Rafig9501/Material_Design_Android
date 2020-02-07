package com.example.material_design_app.mainScreens.pojo;

public class NewsPojo {

    int newsImage;

    String newsTitle;

    String newsDate;

    String newsLike;

    String newsComment;

    String newsText;

    public NewsPojo(int newsImage, String newsTitle, String newsDate, String newsLike, String newsComment, String newsText) {
        this.newsImage = newsImage;
        this.newsTitle = newsTitle;
        this.newsDate = newsDate;
        this.newsLike = newsLike;
        this.newsComment = newsComment;
        this.newsText = newsText;
    }

    public int getNewsImage() {
        return newsImage;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public String getNewsLike() {
        return newsLike;
    }

    public String getNewsComment() {
        return newsComment;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsImage(int newsImage) {
        this.newsImage = newsImage;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

    public void setNewsLike(String newsLike) {
        this.newsLike = newsLike;
    }

    public void setNewsComment(String newsComment) {
        this.newsComment = newsComment;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

}
