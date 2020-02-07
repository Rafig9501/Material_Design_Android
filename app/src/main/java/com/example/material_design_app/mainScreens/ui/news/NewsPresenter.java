package com.example.material_design_app.mainScreens.ui.news;

import com.example.material_design_app.mainScreens.data_interactor.NewsDataInteractor;

public class NewsPresenter implements NewsContractor.Presenter {

    NewsContractor.View view ;

    NewsDataInteractor interactor;

    public NewsPresenter(NewsContractor.View view) {

        this.view = view;

        view.setPresenter(this);

        this.interactor = new NewsDataInteractor(view.getContextOfActivity());

    }


    @Override
    public void getListOfItems() {

        if (view!=null){

            if (interactor!=null){

                view.setListOfItems(interactor.getNewsItems());

            }
        }
    }
}
