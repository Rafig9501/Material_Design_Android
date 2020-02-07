package com.example.material_design_app.mainScreens.ui.expandable;

import android.view.View;
import android.widget.TextView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ExpandableChildPojo;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

 class ExpandableChildViewHolder extends ChildViewHolder {

    TextView phoneNumber;
    TextView emailAddress;

    ExpandableChildViewHolder(View itemView) {

        super(itemView);

        phoneNumber = itemView.findViewById(R.id.expandable_phone_number);
        emailAddress = itemView.findViewById(R.id.expandable_email);
    }

    void onBind(ExpandableChildPojo childPojo){

        phoneNumber.setText(childPojo.getPhone());

        emailAddress.setText(childPojo.getEmail());
    }
}
