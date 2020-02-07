package com.example.material_design_app.mainScreens.ui.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.NewsPojo;

import java.util.List;

public class NewsPagerAdapter extends PagerAdapter {

    Context context;

    LayoutInflater inflater;

    List <NewsPojo> newsPojoList;

    NewsPagerAdapter(Context context, List<NewsPojo> newsPojoList) {
        this.context = context;
        this.newsPojoList = newsPojoList;
    }

    @Override
    public int getCount() {
        return newsPojoList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.news_pager_item_example,null);

        ImageView newsImage = view.findViewById(R.id.news_image);
        TextView newsTitle = view.findViewById(R.id.news_title);
        TextView newsDate = view.findViewById(R.id.news_date);
        TextView newsLike = view.findViewById(R.id.news_like_amount);
        TextView newsComment = view.findViewById(R.id.news_comment_amount);
        TextView newsText = view.findViewById(R.id.news_text);

        newsImage.setImageResource(newsPojoList.get(position).getNewsImage());
        newsTitle.setText(newsPojoList.get(position).getNewsTitle());
        newsDate.setText(newsPojoList.get(position).getNewsDate());
        newsLike.setText(newsPojoList.get(position).getNewsLike());
        newsComment.setText(newsPojoList.get(position).getNewsComment());
        newsText.setText(newsPojoList.get(position).getNewsText());

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);

    }
}
