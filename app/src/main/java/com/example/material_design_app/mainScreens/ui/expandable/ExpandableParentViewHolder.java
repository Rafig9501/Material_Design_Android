package com.example.material_design_app.mainScreens.ui.expandable;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ExpandableChildPojo;
import com.example.material_design_app.mainScreens.pojo.ExpandableParentPojo;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

 class ExpandableParentViewHolder extends GroupViewHolder {

     ImageView expandablePhoto;
     TextView expandableName;
     TextView expandableLocation;


     ExpandableParentViewHolder(View itemView) {
         super(itemView);

         expandablePhoto = itemView.findViewById(R.id.expandable_photo);
         expandableName = itemView.findViewById(R.id.expandable_name);
         expandableLocation = itemView.findViewById(R.id.expandable_location);
     }

     void onBind(ExpandableParentPojo parentPojo) {

         expandablePhoto.setImageResource(parentPojo.getUserPhoto());
         expandableName.setText(parentPojo.getUserName());
         expandableLocation.setText(parentPojo.getUserLocation());
     }
 }