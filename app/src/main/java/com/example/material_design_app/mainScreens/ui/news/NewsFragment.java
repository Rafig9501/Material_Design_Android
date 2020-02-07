package com.example.material_design_app.mainScreens.ui.news;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.NewsPojo;

import java.util.List;

public class NewsFragment extends Fragment implements NewsContractor.View {

    NewsContractor.Presenter presenter;

    View view;

    ViewPager viewPager;

    public NewsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_news, container, false);

        new NewsPresenter(this);

        presenter.getListOfItems();

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

    @Override
    public void setListOfItems(List<NewsPojo> newsPojoList) {

        viewPager = view.findViewById(R.id.viewPager);

        NewsPagerAdapter newsPagerAdapter = new NewsPagerAdapter(getContext(), newsPojoList);

        viewPager.setAdapter(newsPagerAdapter);
    }
}
