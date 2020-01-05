package com.example.recycleviewpractice.model;

public class Product {

    private int id;
    private int imageRes;
    private String title;

    public Product(int id, int imageRes, String title) {
        this.id = id;
        this.imageRes = imageRes;
        this.title = title;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
