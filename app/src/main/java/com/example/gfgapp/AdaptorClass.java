package com.example.gfgapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdaptorClass extends RecyclerView.Adapter<AdaptorClass.viewHolder> {

    ArrayList<ModelClass> list;
    Context context;
    TextView textView2;
    TextView textView;

    public AdaptorClass(ArrayList<ModelClass> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ModelClass model = list.get(position);

        holder.textView2.setText(model.getPic());
        holder.textView.setText(model.getText());

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        public TextView textView2;
        public TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView2 = itemView.findViewById(R.id.imageView1);
            textView = itemView.findViewById(R.id.textView1);
        }

    }
    }
