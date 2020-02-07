package com.example.material_design_app.mainScreens.ui.feed;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.FeedPojo;

 class FeedViewHolder extends RecyclerView.ViewHolder {

    TextView postUserName;
    TextView postDate;
    ImageView postUserAvatar;
    ImageView postPhoto;
    TextView postTitle;

    FeedViewHolder(@NonNull View itemView) {

        super(itemView);

        postUserName = itemView.findViewById(R.id.post_user_name);
        postDate = itemView.findViewById(R.id.post_date);
        postUserAvatar = itemView.findViewById(R.id.post_avatar_ic);
        postPhoto = itemView.findViewById(R.id.post_photo);
        postTitle = itemView.findViewById(R.id.post_title);
    }

    void onBindData(FeedPojo feedPojo, final FeedClickListener feedClickListener){

        postUserName.setText(feedPojo.getPostUserName());
        postDate.setText(feedPojo.getPostDate());
        postUserAvatar.setImageResource(feedPojo.getPostUserAvatar());
        postPhoto.setImageResource(feedPojo.getPostPhoto());
        postTitle.setText(feedPojo.getPostTitle());


        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                feedClickListener.onItemClick();
            }
        });
    }
}
