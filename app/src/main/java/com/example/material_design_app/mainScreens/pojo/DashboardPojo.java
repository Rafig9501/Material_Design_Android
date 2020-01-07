package com.example.material_design_app.mainScreens.pojo;

public class DashboardPojo {

    String dashboardAvatarName;

    String dashboardAvatarLocation;

    int dashboardAvatarImage;


    public DashboardPojo(String dashboardAvatarName, String dashboardAvatarLocation, int dashboardAvatarImage) {
        this.dashboardAvatarName = dashboardAvatarName;
        this.dashboardAvatarLocation = dashboardAvatarLocation;
        this.dashboardAvatarImage = dashboardAvatarImage;
    }

    public String getDashboardAvatarName() {
        return dashboardAvatarName;
    }

    public void setDashboardAvatarName(String dashboardAvatarName) {
        this.dashboardAvatarName = dashboardAvatarName;
    }

    public String getDashboardAvatarLocation() {
        return dashboardAvatarLocation;
    }

    public void setDashboardAvatarLocation(String dashboardAvatarLocation) {
        this.dashboardAvatarLocation = dashboardAvatarLocation;
    }

    public int getDashboardAvatarImage() {
        return dashboardAvatarImage;
    }

    public void setDashboardAvatarImage(int dashboardAvatarImage) {
        this.dashboardAvatarImage = dashboardAvatarImage;
    }
}
