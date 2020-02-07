package com.example.material_design_app.mainScreens.ui.shopping;

import com.example.material_design_app.mainScreens.pojo.ShoppingPojo;
import com.example.material_design_app.mainScreens.ui.BaseView;

import java.util.List;

public interface ShoppingContractor {

    interface View extends BaseView<ShoppingPresenter> {

        void setListOfShoppingItems(List<ShoppingPojo> shoppingItemList);
    }

    interface Presenter{

        void getListOfShoppingItems();
    }

}
