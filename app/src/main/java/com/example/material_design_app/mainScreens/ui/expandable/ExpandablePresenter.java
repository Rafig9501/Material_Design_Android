package com.example.material_design_app.mainScreens.ui.expandable;

import com.example.material_design_app.mainScreens.data_interactor.ExpandableDataInteractor;

public class ExpandablePresenter implements ExpandableContractor.Presenter{

    ExpandableContractor.View view;

    ExpandableDataInteractor parentDataInteractor;

    ExpandablePresenter(ExpandableContractor.View view) {

        this.view = view;

        view.setPresenter(this);

        parentDataInteractor = new ExpandableDataInteractor(view.getContextOfActivity());
    }


    @Override
    public void getParentList() {

    if (view!=null)
    {
         if (parentDataInteractor!=null)
         {
             view.setParentList(parentDataInteractor.getItemList());
         }
    }
    }
}
