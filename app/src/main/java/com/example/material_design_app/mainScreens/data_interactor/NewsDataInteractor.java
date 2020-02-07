package com.example.material_design_app.mainScreens.data_interactor;

import android.content.Context;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.NewsPojo;

import java.util.ArrayList;
import java.util.List;

public class NewsDataInteractor {

    public NewsDataInteractor(Context context) {
    }

    public List <NewsPojo> getNewsItems(){

        List <NewsPojo> newsPojoList = new ArrayList<>();

        newsPojoList.add(new NewsPojo(R.drawable.news_item_image,"The quick brown\n fox jumps over",
                "February 11th","324","43","Lorem Ipsum is simply dummy text of the\n" +
                "        printing and typesetting industry"));
        newsPojoList.add(new NewsPojo(R.drawable.news_item_image,"The quick brown\n fox jumps over",
                "February 11th","324","43","Lorem Ipsum is simply dummy text of the\n" +
                "        printing and typesetting industry"));
        newsPojoList.add(new NewsPojo(R.drawable.news_item_image,"The quick brown\n fox jumps over",
                "February 11th","324","43","Lorem Ipsum is simply dummy text of the\n" +
                "        printing and typesetting industry"));


        return newsPojoList;
    }
}
