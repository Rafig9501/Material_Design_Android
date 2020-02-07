package com.example.material_design_app.mainScreens.ui.dashboard;

import com.example.material_design_app.mainScreens.pojo.DashboardPojo;
import com.example.material_design_app.mainScreens.ui.BaseView;

import java.util.List;

public interface DashboardContractor {

    interface Presenter {

        void getListOfSliders();
    }

    interface View extends BaseView <DashboardPresenter> {

        void setListOfSlidersToView(List<DashboardPojo> listOfItemsToView);

    }
}
