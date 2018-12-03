package com.example.kienphung.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerview;
    private RecyclerviewAdapter mRecyclerAdapter;
    private List<ItemImage> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerview = findViewById(R.id.recycler_main);
        mData = new ArrayList<>();
        mData.add(new ItemImage(R.drawable.hero1, Constants.HERO_1));
        mData.add(new ItemImage(R.drawable.hero2, Constants.HERO_2));
        mData.add(new ItemImage(R.drawable.hero3, Constants.HERO_3));
        mData.add(new ItemImage(R.drawable.hero7, Constants.HERO_4));
        mData.add(new ItemImage(R.drawable.hero5, Constants.HERO_5));
        mData.add(new ItemImage(R.drawable.hero6, Constants.HERO_6));
        mData.add(new ItemImage(R.drawable.hero5, Constants.HERO_7));
        mData.add(new ItemImage(R.drawable.hero3, Constants.HERO_8));
        mData.add(new ItemImage(R.drawable.hero2, Constants.HERO_9));
        mData.add(new ItemImage(R.drawable.hero1, Constants.HERO_10));
        mRecyclerAdapter = new RecyclerviewAdapter(mData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setAdapter(mRecyclerAdapter);

    }
}
