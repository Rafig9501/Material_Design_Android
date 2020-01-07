package com.example.material_design_app.mainScreens.ui.dashboard;

import com.example.material_design_app.mainScreens.data_interactor.DashboardDataInteractor;

public class DashboardPresenter implements DashboardContractor.Presenter{

    DashboardContractor.View view;

    DashboardDataInteractor interactor;

    DashboardPresenter(DashboardContractor.View view) {

        this.view = view;

        view.setPresenter(this);

        interactor = new DashboardDataInteractor(view.getContextOfActivity());
    }

    @Override
    public void getListOfItems() {

        if (view != null) {

            if (interactor != null) {

                view.setListOfItemsToView(interactor.getDashboardItems());

            }
        }

    }
}
