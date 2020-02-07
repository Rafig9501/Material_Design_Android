package com.example.material_design_app.mainScreens.data_interactor;

import android.content.Context;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ExpandableChildPojo;
import com.example.material_design_app.mainScreens.pojo.ExpandableParentPojo;

import java.util.ArrayList;
import java.util.List;

public class ExpandableDataInteractor {

   Context context;

    public ExpandableDataInteractor(Context context) {
        this.context = context;
    }

    List<ExpandableChildPojo> getChildList(){

        List<ExpandableChildPojo> childList = new ArrayList<>();

        childList.add(new ExpandableChildPojo("5-(989)262-8570","studio@csform.com"));

        return childList;
    }

    public List<ExpandableParentPojo> getItemList(){

        List <ExpandableParentPojo> itemList = new ArrayList<>();

        itemList.add(new ExpandableParentPojo(R.drawable.expandable_photo_1,"Karen Stuwart", "New York, USA","",getChildList()));
        itemList.add(new ExpandableParentPojo(R.drawable.expandable_photo_2,"Jose Edwards", "Copenhagen, Denmark","",getChildList()));
        itemList.add(new ExpandableParentPojo(R.drawable.expandable_photo_3,"Helen Berry", "Paris, France","",getChildList()));
        itemList.add(new ExpandableParentPojo(R.drawable.expandable_photo_4,"Samuel Powell", "London, England","",getChildList()));

        return itemList;
    }
}