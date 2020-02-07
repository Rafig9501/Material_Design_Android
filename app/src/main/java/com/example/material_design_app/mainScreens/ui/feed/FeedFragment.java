package com.example.material_design_app.mainScreens.ui.feed;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.FeedPojo;

import java.util.List;

public class FeedFragment extends Fragment implements FeedContractor.View {

    FeedContractor.Presenter presenter;
    RecyclerView recyclerView;
    View view;

    public FeedFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_feed, container, false);

        recyclerView = view.findViewById(R.id.feed_recyclerview);

        new FeedPresenter(this);

        presenter.getListOfFeed();

        return view;
    }

    @Override
    public void setListOfFeed(List<FeedPojo> listOfPosts) {

        FeedRecyclerAdaptor feedRecyclerAdaptor = new FeedRecyclerAdaptor(getActivity().getBaseContext(), listOfPosts, new FeedClickListener() {
            @Override
            public void onItemClick() {
                Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(feedRecyclerAdaptor);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
    }

    @Override
    public void setPresenter(FeedPresenter presenter) {

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
