package com.example.material_design_app.mainScreens.ui.expandable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ExpandableChildPojo;
import com.example.material_design_app.mainScreens.pojo.ExpandableParentPojo;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ExpandableRecyclerViewAdaptor extends ExpandableRecyclerViewAdapter<ExpandableParentViewHolder,ExpandableChildViewHolder> {

    Context context;

    ExpandableRecyclerViewAdaptor(List<? extends ExpandableGroup> groups,Context context) {
        super(groups);
        this.context = context;
    }

    @Override
    public ExpandableParentViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        @SuppressLint("ResourceType")
        View view = inflater.inflate(R.layout.expandable_recyclerview_parent_item_example,parent,false);

        return new ExpandableParentViewHolder(view);
    }

    @Override
    public ExpandableChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.expandable_recyclerview_child_item,parent,false);

        return new ExpandableChildViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ExpandableChildViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {

        final ExpandableChildPojo childPojo = ((ExpandableParentPojo)group).getItems().get(childIndex);

        holder.onBind(childPojo);

    }

    @Override
    public void onBindGroupViewHolder(ExpandableParentViewHolder holder, int flatPosition, ExpandableGroup group) {

        holder.onBind((ExpandableParentPojo) group);
    }

//    ExpandableParentPojo parentPojoList;
//
//    ExpandableChildPojo childPojoList;

}
