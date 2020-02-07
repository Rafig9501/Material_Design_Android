package com.example.material_design_app.mainScreens.ui.feed;

import com.example.material_design_app.mainScreens.data_interactor.FeedDataInteractor;

public class FeedPresenter implements FeedContractor.Presenter {

    FeedContractor.View view;
    FeedDataInteractor interactor;

    FeedPresenter(FeedContractor.View view) {

        this.view = view;

        view.setPresenter(this);

        interactor = new FeedDataInteractor(view.getContextOfActivity());

    }

    @Override
    public void getListOfFeed() {

        if (view != null) {

            if (interactor != null) {

                view.setListOfFeed(interactor.getFeedPosts());
            }
        }
    }
}
