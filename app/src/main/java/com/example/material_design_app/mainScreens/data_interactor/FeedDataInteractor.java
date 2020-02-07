package com.example.material_design_app.mainScreens.data_interactor;

import android.content.Context;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.FeedPojo;

import java.util.ArrayList;
import java.util.List;

public class FeedDataInteractor {

    Context context;

    public FeedDataInteractor(Context context) {
        this.context = context;
    }

    public List <FeedPojo> getFeedPosts(){

        List <FeedPojo> postList = new ArrayList<>();

        postList.add(new FeedPojo("Jordan Robinson","Today, 1:45 PM",
                R.drawable.astronaut_avatar,R.drawable.feed_photo_1," Lorem Ipsum is simply dummy text of the\n" +
                "printing and typesetting industry"));

        postList.add(new FeedPojo("Jordan Robinson","Today, 1:45 PM",
                R.drawable.astronaut_avatar,R.drawable.feed_photo_2," Lorem Ipsum is simply dummy text of the\n" +
                "printing and typesetting industry"));

        postList.add(new FeedPojo("Jordan Robinson","Today, 1:45 PM",
                R.drawable.astronaut_avatar,R.drawable.feed_photo_1," Lorem Ipsum is simply dummy text of the\n" +
                "printing and typesetting industry"));

        postList.add(new FeedPojo("Jordan Robinson","Today, 1:45 PM",
                R.drawable.astronaut_avatar,R.drawable.feed_photo_2," Lorem Ipsum is simply dummy text of the\n" +
                "printing and typesetting industry"));

        postList.add(new FeedPojo("Jordan Robinson","Today, 1:45 PM",
                R.drawable.astronaut_avatar,R.drawable.feed_photo_1," Lorem Ipsum is simply dummy text of the\n" +
                "printing and typesetting industry"));;

        return postList;
    }
}
