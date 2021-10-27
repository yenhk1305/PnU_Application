package com.example.pnu_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class Notification_Blog_Screen extends AppCompatActivity {

    TabHost tabHost;
    ListView lvNotification, lvBlog;
    String[] thongBao, blogs;
    ArrayAdapter<String> adapterThongBao, adapterBlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_blog_screen);
        addControls();
    }

    private void addControls() {
        lvNotification = findViewById(R.id.lvNotification);
        lvBlog = findViewById(R.id.lvBlog);

        //gắn dữ liệu cho thông báo
        thongBao = getResources().getStringArray(R.array.arrThongBao);
        adapterThongBao = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thongBao);
        lvNotification.setAdapter(adapterThongBao);

        //gắn dữ liệu cho blog
        blogs = getResources().getStringArray(R.array.arrBlog);
        adapterBlog = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,blogs);
        lvBlog.setAdapter(adapterBlog);

        //Tạo tabhost
        tabHost = findViewById(R.id.tabHost);
        tabHost.setup();
        creatTab();
    }

    private void creatTab() {
        //tạo tab Thông báo
        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("Thông báo");
        tabHost.addTab(tab1);

        //tạo tab Blog
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tabBlog");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("Blog");
        tabHost.addTab(tab2);
    }
}