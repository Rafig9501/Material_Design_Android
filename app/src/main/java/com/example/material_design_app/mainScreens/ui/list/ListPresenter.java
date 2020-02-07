package com.example.material_design_app.mainScreens.ui.list;

import com.example.material_design_app.mainScreens.data_interactor.ListDataInteractor;

import java.util.List;

public class ListPresenter implements ListContractor.Presenter {

    ListContractor.View view;

    ListDataInteractor interactor;

    public ListPresenter(ListContractor.View view) {

        this.view = view;

        view.setPresenter(this);

        interactor = new ListDataInteractor(view.getContextOfActivity());
    }

    @Override
    public void getListOfItems(List listOfItems) {



    }
}
