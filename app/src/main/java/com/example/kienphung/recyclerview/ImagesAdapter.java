package com.example.kienphung.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ImagesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Image> mImages;

    public ImagesAdapter(List<Image> images) {
        this.mImages = images;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate((R.layout.item_image), parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int postion) {
        ((ViewHolder) holder).bindData(mImages.get(postion));
    }

    @Override
    public int getItemCount() {
        return mImages == null ? 0 : mImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageHero;
        public TextView mTextHero;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_hero);
            mTextHero = itemView.findViewById(R.id.text_hero);
        }

        public void bindData(Image image) {
            mTextHero.setText(image.getmName());
            mImageHero.setImageResource(image.getIdImage());
        }
    }
}
