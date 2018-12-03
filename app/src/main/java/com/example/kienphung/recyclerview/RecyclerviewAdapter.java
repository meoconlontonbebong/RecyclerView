package com.example.kienphung.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ItemImage> mImageList;

    public RecyclerviewAdapter(List<ItemImage> list) {
        this.mImageList = list;
    }


    @Override

    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup parent,  int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext()) ;
        View view = inflater.inflate((R.layout.item_image) , parent , false );
                 return new RecyclerViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        RecyclerViewHolder viewHolder = (RecyclerViewHolder) holder;
        viewHolder.mTextHero.setText(mImageList.get(position).getmName());
        viewHolder.mImageHero.setImageResource(mImageList.get(position).getmIdImage());
    }

    @Override
    public int getItemCount() {
        return mImageList == null ? 0 : mImageList.size();
    }
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageHero;
        TextView mTextHero;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_hero);
            mTextHero = itemView.findViewById(R.id.text_hero);
        }
    }
}

