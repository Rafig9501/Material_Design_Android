package com.example.material_design_app.mainScreens.ui.shopping;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ShoppingPojo;
import com.example.material_design_app.mainScreens.ui.dashboard.DashboardRecyclerAdaptor;

import java.util.List;


public class ShoppingFragment extends Fragment implements ShoppingContractor.View{

    ShoppingContractor.Presenter presenter;

    RecyclerView recyclerView;

    View view;

    public ShoppingFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_shopping, container, false);

        recyclerView = view.findViewById(R.id.shopping_recyclerview);

        new ShoppingPresenter(this);

        presenter.getListOfShoppingItems();

        return view;
    }

    @Override
    public void setListOfShoppingItems(List <ShoppingPojo> shoppingItems) {

        ShoppingRecyclerAdaptor adaptor = new ShoppingRecyclerAdaptor(getActivity().getBaseContext(), shoppingItems);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());

        recyclerView.addItemDecoration(dividerItemDecoration);

        recyclerView.setAdapter(adaptor);

        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void setPresenter(ShoppingPresenter presenter) {

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
