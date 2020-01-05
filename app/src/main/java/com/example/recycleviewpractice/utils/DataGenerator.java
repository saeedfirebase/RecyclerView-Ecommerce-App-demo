package com.example.recycleviewpractice.utils;

import com.example.recycleviewpractice.R;
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
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));
        productList.add(new Product(6, R.drawable.ic_avengers,"Product 6"));

        return productList;
    }
}
