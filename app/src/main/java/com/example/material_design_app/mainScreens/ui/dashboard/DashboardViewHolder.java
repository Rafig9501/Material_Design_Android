package com.example.material_design_app.mainScreens.ui.dashboard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.DashboardPojo;

public class DashboardViewHolder extends RecyclerView.ViewHolder {

    ImageView dashboardAvatar;
    TextView avatarName;
    TextView avatarLocation;

    public DashboardViewHolder(@NonNull View itemView) {

        super(itemView);

        dashboardAvatar = itemView.findViewById(R.id.dashboard_avatar_image);
        avatarName = itemView.findViewById(R.id.dashboard_avatar_name);
        avatarLocation = itemView.findViewById(R.id.dashboard_avatar_location);

    }

    void bindData(DashboardPojo dashboardPojo) {

        dashboardAvatar.setImageResource(dashboardPojo.getDashboardAvatarImage());

        avatarName.setText(dashboardPojo.getDashboardAvatarName());

        avatarLocation.setText(dashboardPojo.getDashboardAvatarLocation());

    }
}
