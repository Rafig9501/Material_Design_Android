package com.example.material_design_app.mainScreens.data_interactor;

import android.content.Context;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ListBigPhotoPojo;
import com.example.material_design_app.mainScreens.pojo.ListSmallPhotoPojo;

import java.util.ArrayList;
import java.util.List;

public class ListDataInteractor {

    Context context;

    public ListDataInteractor(Context context) {
        this.context = context;
    }

    public List getListItems(){

        List listItems = new ArrayList();

        listItems.add(new ListSmallPhotoPojo(R.drawable.list_image_1,"The quick brown fox\njumps over the lazy dog","Today, 1:45 PM"));

        listItems.add(new ListBigPhotoPojo(R.drawable.list_photo_2,"The quick brown fox jumps","Today, 1:45 PM"));

        listItems.add(new ListSmallPhotoPojo(R.drawable.list_image_3,"The quick brown fox\njumps over the lazy dog","Today, 1:45 PM"));

        listItems.add(new ListSmallPhotoPojo(R.drawable.list_image_1,"The quick brown fox\njumps over the lazy dog","Today, 1:45 PM"));

        listItems.add(new ListBigPhotoPojo(R.drawable.list_photo_2,"The quick brown fox jumps","Today, 1:45 PM"));

        listItems.add(new ListSmallPhotoPojo(R.drawable.list_image_3,"The quick brown fox\njumps over the lazy dog","Today, 1:45 PM"));

        listItems.add(new ListSmallPhotoPojo(R.drawable.list_image_1,"The quick brown fox\njumps over the lazy dog","Today, 1:45 PM"));

        listItems.add(new ListBigPhotoPojo(R.drawable.list_photo_2,"The quick brown fox jumps","Today, 1:45 PM"));

        listItems.add(new ListSmallPhotoPojo(R.drawable.list_image_3,"The quick brown fox\njumps over the lazy dog","Today, 1:45 PM"));

        return listItems;
    }
}
