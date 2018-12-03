package com.example.kienphung.recyclerview;

public class ItemImage {
    private int mIdImage ;
    private  String mName ;

    public ItemImage(int mIdImage, String mName) {
        this.mIdImage = mIdImage;
        this.mName = mName;
    }

    public int getmIdImage() {
        return mIdImage;
    }

    public void setmIdImage(int mIdImage) {
        this.mIdImage = mIdImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
