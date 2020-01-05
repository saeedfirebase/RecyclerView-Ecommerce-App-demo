package com.example.recycleviewpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewpractice.R;
import com.example.recycleviewpractice.model.Product;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {



    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageId);
            title = itemView.findViewById(R.id.titleId);

        }
    }
    Context context;
    List<Product> productList;
    int layoutResource = R.layout.row_product_list;

    public MovieAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(layoutResource,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.image.setImageResource(product.getImageRes());
        holder.title.setText(product.getTitle());
    }

    @Override
    public int getItemCount() {
        return productList.size() ;
    }
}
