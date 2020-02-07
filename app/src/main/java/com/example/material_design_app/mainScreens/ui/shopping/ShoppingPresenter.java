package com.example.material_design_app.mainScreens.ui.shopping;

import com.example.material_design_app.mainScreens.data_interactor.ShoppingDataInteractor;
import com.example.material_design_app.mainScreens.pojo.ShoppingPojo;

import java.util.List;

public class ShoppingPresenter implements ShoppingContractor.Presenter {

    ShoppingContractor.View view;

    ShoppingDataInteractor interactor;

    ShoppingPresenter(ShoppingContractor.View view) {

        this.view = view;

        view.setPresenter(this);

        interactor = new ShoppingDataInteractor(view.getContextOfActivity());

    }

    @Override
    public void getListOfShoppingItems() {

        if (view != null) {

            if (interactor != null) {

                view.setListOfShoppingItems(interactor.getShoppingItemList());

            }
        }
    }
}
