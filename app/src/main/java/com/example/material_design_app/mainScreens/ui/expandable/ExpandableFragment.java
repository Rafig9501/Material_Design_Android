package com.example.material_design_app.mainScreens.ui.expandable;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.data_interactor.ExpandableDataInteractor;

import java.util.List;


public class ExpandableFragment extends Fragment implements ExpandableContractor.View {

    ExpandableContractor.Presenter presenter;

    RecyclerView recyclerView;

    View view;

    public ExpandableFragment() {
        // Required empty public constructor
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {

        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_expandable, container, false);

        new ExpandablePresenter(this);

        presenter.getParentList();

        return view;
    }

    @Override
    public void setParentList(List itemList) {

        recyclerView = view.findViewById(R.id.expandable_recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ExpandableRecyclerViewAdaptor adaptor = new  ExpandableRecyclerViewAdaptor(itemList,getContext());

        recyclerView.setAdapter(adaptor);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adaptor);

    }

    @Override
    public void setPresenter(ExpandablePresenter presenter) {

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
