package com.example.louis.listviewtest;

/**
 * Created by caosy on 2017/9/11.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int ImageId){
        this.name = name;
        this.imageId = ImageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
