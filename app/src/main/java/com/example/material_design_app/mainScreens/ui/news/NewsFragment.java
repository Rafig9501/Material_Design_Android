package com.example.material_design_app.mainScreens.ui.news;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.material_design_app.R;

public class NewsFragment extends Fragment implements NewsContractor.View {

    NewsContractor.Presenter presenter;

    public NewsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);

        return view;

    }

    @Override
    public void setPresenter(NewsPresenter presenter) {

        this.presenter = presenter;

    }

    @Override
    public Context getContextOfActivity() {
        return getContext();
    }

    @Override
    public Activity getActivityOfActivity() {
        return getActivity();
    }
}
