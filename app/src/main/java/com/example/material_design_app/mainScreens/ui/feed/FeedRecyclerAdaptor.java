package com.example.material_design_app.mainScreens.ui.feed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.FeedPojo;

import java.util.List;

public class FeedRecyclerAdaptor extends RecyclerView.Adapter<FeedViewHolder> {

    Context context;
    List<FeedPojo> feedPojoList;
    FeedClickListener feedClickListener;

    FeedRecyclerAdaptor(Context context, List<FeedPojo> feedPojoList, FeedClickListener feedClickListener) {
        this.context = context;
        this.feedPojoList = feedPojoList;
        this.feedClickListener = feedClickListener;
    }


    @NonNull
    @Override
    public FeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.feed_recyclerview_post_example, parent, false);

        FeedViewHolder viewHolder = new FeedViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeedViewHolder holder, int position) {

        holder.onBindData(feedPojoList.get(position), feedClickListener);
    }

    @Override
    public int getItemCount() {
        return feedPojoList.size();
    }


}
