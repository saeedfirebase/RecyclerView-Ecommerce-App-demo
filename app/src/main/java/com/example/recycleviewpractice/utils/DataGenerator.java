package com.example.recycleviewpractice.utils;

import com.example.recycleviewpractice.R;
import com.example.recycleviewpractice.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Product> getProducts(){

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, R.drawable.ic_avengers,"Catagory 1"));
        productList.add(new Product(2, R.drawable.ic_avengers,"Catagory 2"));
        productList.add(new Product(3, R.drawable.ic_avengers,"Catagory 3"));
        productList.add(new Product(4, R.drawable.ic_avengers,"Catagory 4"));
        productList.add(new Product(5, R.drawable.ic_avengers,"Catagory 5"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 7"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 8"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 9"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 10"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 11"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 12"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 13"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 14"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 15"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 16"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 17"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 18"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Catagory 19"));

        return productList;
    }
}
