package com.example.recycleviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ActionMenuView;

import com.example.recycleviewpractice.adapter.CatagoryAdapder;
import com.example.recycleviewpractice.adapter.MovieAdapter;
import com.example.recycleviewpractice.utils.DataGenerator;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView, recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerviewId);
        recyclerView2 = findViewById(R.id.recyclerviewId2);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager2
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView2.setLayoutManager(layoutManager2);



        MovieAdapter adapter = new MovieAdapter(this, DataGenerator.getProducts());
        recyclerView.setAdapter(adapter);

        CatagoryAdapder adapder2 = new CatagoryAdapder(this, DataGenerator.getCatagory());
        recyclerView2.setAdapter(adapder2);

    }


}
