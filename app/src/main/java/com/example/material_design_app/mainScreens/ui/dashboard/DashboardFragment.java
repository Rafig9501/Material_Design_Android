package com.example.material_design_app.mainScreens.ui.dashboard;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.DashboardPojo;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment implements DashboardContractor.View {

    DashboardContractor.Presenter presenter;

    RecyclerView recyclerView;

    View view;

    public DashboardFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        recyclerView = view.findViewById(R.id.dashboard_recycler_view);

        new DashboardPresenter(this);

        presenter.getListOfItems();

        return view;

    }


    @Override
    public void setListOfItemsToView(List<DashboardPojo> listOfItemsToView) {

        RecyclerView recyclerView = view.findViewById(R.id.dashboard_recycler_view);

        RecyclerAdaptorDashboard adaptorDashboard = new RecyclerAdaptorDashboard(getActivity().getBaseContext(), listOfItemsToView);

        recyclerView.setAdapter(adaptorDashboard);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));

    }

    @Override
    public void setPresenter(DashboardPresenter presenter) {

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
