package com.example.kienphung.recyclerview;

public class Image {
    private int mIdImage ;
    private  String mName ;

    public Image(int idImage, String name) {
        this.mIdImage = idImage;
        this.mName = name;
    }

    public int getIdImage() {
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
