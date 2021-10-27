package com.example.pnu_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.adapter.BannerAdapter;
import com.example.model.Banner;

import java.util.ArrayList;

public class Home_Screen extends AppCompatActivity {
    RecyclerView rcvBanner;
    BannerAdapter bannerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        linkView();
        configRecyclerView();
        initData();
    }

    private void linkView() {
        rcvBanner=findViewById(R.id.rcvBanner);
    }

    private void configRecyclerView() {
        LinearLayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rcvBanner.setLayoutManager(manager);

        rcvBanner.setHasFixedSize(true);
        rcvBanner.setItemAnimator(new DefaultItemAnimator());
    }

    private void initData() {
        ArrayList<Banner> banners=new ArrayList<>();
        banners.add(new Banner(R.drawable.banner_1));
        banners.add(new Banner(R.drawable.banner_2));
        banners.add(new Banner(R.drawable.banner_3));
        banners.add(new Banner(R.drawable.banner_4));

        bannerAdapter=new BannerAdapter(getApplicationContext(),banners);
        rcvBanner.setAdapter(bannerAdapter);


    }

}