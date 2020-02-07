package com.example.material_design_app.mainScreens.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.DashboardPojo;

import java.util.List;

public class DashboardRecyclerAdaptor extends RecyclerView.Adapter<DashboardViewHolder> {

    Context context;
    List<DashboardPojo> dashboardPojoList;

     DashboardRecyclerAdaptor(Context context, List<DashboardPojo> dashboardPojoList) {
        this.context = context;
        this.dashboardPojoList = dashboardPojoList;
    }

    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycle_item_dashboard, parent, false);

        DashboardViewHolder viewHolder = new DashboardViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {

        holder.bindData(dashboardPojoList.get(position));
    }


    @Override
    public int getItemCount() {
        return dashboardPojoList.size();
    }

}