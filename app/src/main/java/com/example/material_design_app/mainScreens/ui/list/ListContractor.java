package com.example.material_design_app.mainScreens.ui.list;

import com.example.material_design_app.mainScreens.ui.BaseView;

import java.util.List;

public interface ListContractor {

    interface View extends BaseView <ListPresenter>{

        void setListOfItems();
    }

    interface Presenter {

        void getListOfItems(List listOfItems);
    }
}
