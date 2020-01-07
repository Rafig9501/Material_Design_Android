package com.example.material_design_app.mainScreens.ui;

import android.app.Activity;
import android.content.Context;

public interface BaseView <T> {

    void setPresenter(T presenter);
    Context getContextOfActivity();
    Activity getActivityOfActivity();

}
