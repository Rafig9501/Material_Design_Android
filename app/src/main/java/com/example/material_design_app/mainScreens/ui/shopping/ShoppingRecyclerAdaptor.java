package com.example.material_design_app.mainScreens.ui.shopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.ShoppingPojo;

import java.util.List;

public class ShoppingRecyclerAdaptor extends RecyclerView.Adapter<ShoppingViewHolder> {

    Context context;

    List <ShoppingPojo> shoppingPojoList;


    ShoppingRecyclerAdaptor(Context context, List<ShoppingPojo> shoppingPojoList) {
        this.context = context;
        this.shoppingPojoList = shoppingPojoList;
    }

    @NonNull
    @Override
    public ShoppingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.shoppincart_recyclerview_item_example,parent,false);

        ShoppingViewHolder holder = new ShoppingViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingViewHolder holder, int position) {

        holder.bindData(shoppingPojoList.get(position));
    }

    @Override
    public int getItemCount() {
        return shoppingPojoList.size();
    }

}
