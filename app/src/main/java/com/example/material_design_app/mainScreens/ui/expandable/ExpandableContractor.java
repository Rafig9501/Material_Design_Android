package com.example.material_design_app.mainScreens.ui.expandable;

import com.example.material_design_app.mainScreens.pojo.ExpandableParentPojo;
import com.example.material_design_app.mainScreens.ui.BaseView;

import java.util.List;

public interface ExpandableContractor {

    interface View extends BaseView<ExpandablePresenter>{

        void setParentList(List<ExpandableParentPojo> itemList);
    }

    interface Presenter {

        void getParentList();
    }
}
