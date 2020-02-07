package com.example.material_design_app.mainScreens.ui.list;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.data_interactor.ListDataInteractor;

public class ListFragment extends Fragment implements ListContractor.View{

    ListContractor.Presenter presenter;

    RecyclerView recyclerView;

    View view;

    public ListFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_list, container, false);

        return view;
    }

    @Override
    public void setListOfItems() {

    }

    @Override
    public void setPresenter(ListPresenter presenter) {

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
