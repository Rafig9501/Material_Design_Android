package com.example.material_design_app.mainScreens.ui.feed;

import com.example.material_design_app.mainScreens.pojo.FeedPojo;
import com.example.material_design_app.mainScreens.ui.BaseView;

import java.util.List;

public interface FeedContractor {

    interface Presenter {

        void getListOfFeed();
    }

    interface View extends BaseView <FeedPresenter>{

        void setListOfFeed(List <FeedPojo> listOfPosts);
    }
}
