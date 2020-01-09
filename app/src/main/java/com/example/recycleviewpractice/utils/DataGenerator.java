package com.example.recycleviewpractice.utils;

import com.example.recycleviewpractice.R;
import com.example.recycleviewpractice.model.Catagory;
import com.example.recycleviewpractice.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Product> getProducts(){

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, R.drawable.ic_avengers,"Product 1"));
        productList.add(new Product(2, R.drawable.ic_avengers,"Product 2"));
        productList.add(new Product(3, R.drawable.ic_avengers,"Product 3"));
        productList.add(new Product(4, R.drawable.ic_avengers,"Product 4"));
        productList.add(new Product(5, R.drawable.ic_avengers,"Product 5"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 7"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 8"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 9"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 10"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 11"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 12"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 13"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 14"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 15"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 16"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 17"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 18"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 19"));

        return productList;
    }

    public static List<Catagory> getCatagory(){

        List<Catagory> catagoryList = new ArrayList<>();
        catagoryList.add(new Catagory(1,"Catagory 1"));
        catagoryList.add(new Catagory(2,"Catagory 2"));
        catagoryList.add(new Catagory(3,"Catagory 3"));
        catagoryList.add(new Catagory(4,"Catagory 4"));
        catagoryList.add(new Catagory(5,"Catagory 5"));
        catagoryList.add(new Catagory(6,"Catagory 6"));
        catagoryList.add(new Catagory(7,"Catagory 7"));
        catagoryList.add(new Catagory(8,"Catagory 8"));
        catagoryList.add(new Catagory(9,"Catagory 9"));
        catagoryList.add(new Catagory(10,"Catagory 10"));


    return catagoryList;
    }
}
