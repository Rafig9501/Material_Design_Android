package com.example.material_design_app.mainScreens.ui.news;

import com.example.material_design_app.mainScreens.pojo.NewsPojo;
import com.example.material_design_app.mainScreens.ui.BaseView;

import java.util.List;

public interface NewsContractor {

    interface View extends BaseView <NewsPresenter>{

        void setListOfItems(List<NewsPojo> newsPojoList);

    }

    interface Presenter{

        void getListOfItems();

    }

}
