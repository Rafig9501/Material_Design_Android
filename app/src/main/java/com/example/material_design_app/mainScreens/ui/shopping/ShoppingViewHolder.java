package com.example.material_design_app.mainScreens.ui.shopping;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ShoppingPojo;

class ShoppingViewHolder extends RecyclerView.ViewHolder  {

    ImageView shoppingItemPhoto;
    TextView  shoppingItemName;
    TextView  shoppingItemPrice;
    TextView  shoppingItemAmount;
    ImageView shoppingPlus;
    ImageView shoppingMinus;
    TextView  totalItemPrice;

    int itemAmount = 0;

    static int totalPrice = 0;

    ShoppingViewHolder(@NonNull View itemView) {

        super(itemView);

        shoppingItemPhoto = itemView.findViewById(R.id.shopping_item_photo);
        shoppingItemName = itemView.findViewById(R.id.shopping_item_name);
        shoppingItemPrice = itemView.findViewById(R.id.shopping_item_price);
        shoppingItemAmount = itemView.findViewById(R.id.shopping_item_amount);
        shoppingPlus = itemView.findViewById(R.id.shopping_plus);
        shoppingMinus = itemView.findViewById(R.id.shopping_minus);
        totalItemPrice = itemView.findViewById(R.id.shopping_total_price);
    }

    void bindData(ShoppingPojo shoppingPojo) {

        shoppingItemPhoto.setImageResource(shoppingPojo.getShoppingItemPhoto());

        shoppingItemName.setText(shoppingPojo.getShoppingItemName());

        shoppingItemPrice.setText(String.valueOf(shoppingPojo.getShoppingItemPrice()));

        shoppingItemAmount.setText(String.valueOf(shoppingPojo.getShoppingItemAmount()));

        shoppingPlus.setImageResource(shoppingPojo.getShoppingPlus());

        shoppingMinus.setImageResource(shoppingPojo.getShoppingMinus());

        shoppingPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (itemAmount!=10) {

                    ++itemAmount;

                    shoppingItemAmount.setText(String.valueOf(itemAmount));

                }
            }
        });

        shoppingMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (itemAmount!=0){

                --itemAmount;

                shoppingItemAmount.setText(String.valueOf(itemAmount));
            }
          }
        });
    }
}
