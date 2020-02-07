package com.example.material_design_app.mainScreens.data_interactor;

import android.content.Context;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ShoppingPojo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingDataInteractor {

    Context context;

    public ShoppingDataInteractor(Context context) {
        this.context = context;
    }

    public List<ShoppingPojo> getShoppingItemList(){

        List<ShoppingPojo> itemList = new ArrayList<>();

        itemList.add(new ShoppingPojo(R.drawable.shopping_item_1,"White Shirt",43.00,0,R.drawable.plus,R.drawable.minus));
        itemList.add(new ShoppingPojo(R.drawable.shopping_item_2,"Nike Sneakers",95.99,0,R.drawable.plus,R.drawable.minus));
        itemList.add(new ShoppingPojo(R.drawable.shopping_item_3,"Simple T-Shirt",4.99,0,R.drawable.plus,R.drawable.minus));
        itemList.add(new ShoppingPojo(R.drawable.shopping_item_4,"Blac Cap",8.45,0,R.drawable.plus,R.drawable.minus));

        return itemList;
    }
}
