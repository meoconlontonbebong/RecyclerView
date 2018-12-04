package com.example.kienphung.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerImages;
    private ImagesAdapter mImagesAdapter;
    private List<Image> mImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerImages = findViewById(R.id.recycler_main);
        initData();
        mImagesAdapter = new ImagesAdapter(mImages);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerImages.setLayoutManager(layoutManager);
        mRecyclerImages.setAdapter(mImagesAdapter);
    }

   private void initData(){
       mImages = new ArrayList<>();
       mImages.add(new Image(R.drawable.hero1, Constants.HERO_1));
       mImages.add(new Image(R.drawable.hero2, Constants.HERO_2));
       mImages.add(new Image(R.drawable.hero3, Constants.HERO_3));
       mImages.add(new Image(R.drawable.hero2, Constants.HERO_4));
       mImages.add(new Image(R.drawable.hero1, Constants.HERO_5));
       mImages.add(new Image(R.drawable.hero3, Constants.HERO_6));
       mImages.add(new Image(R.drawable.hero2, Constants.HERO_7));
       mImages.add(new Image(R.drawable.hero3, Constants.HERO_8));
       mImages.add(new Image(R.drawable.hero2, Constants.HERO_9));
       mImages.add(new Image(R.drawable.hero1, Constants.HERO_10));
   }
}
