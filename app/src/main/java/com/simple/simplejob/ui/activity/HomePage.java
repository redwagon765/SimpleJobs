package com.simple.simplejob.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.simple.simplejob.R;
import com.simple.simplejob.adapter.SlideBarAdapter;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    int image[] = {R.drawable.fist, R.drawable.second, R.drawable.third, R.drawable.fourth, R.drawable.fiveth};
    RecyclerView mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN = {R.drawable.fist, R.drawable.second, R.drawable.third, R.drawable.fourth, R.drawable.fiveth};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mPager = findViewById(R.id.pager);

        mPager.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        SlideBarAdapter slideBarAdapter=new SlideBarAdapter(this,image);
        mPager.setAdapter(slideBarAdapter);

    }



}
