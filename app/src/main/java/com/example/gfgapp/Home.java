package com.example.gfgapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    RecyclerView recyclerView;
    BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<ModelClass> list = new ArrayList<>();
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));
        list.add(new ModelClass(getString(R.string.read), getString(R.string.dsa_sample_article)));

        AdaptorClass adapter = new AdaptorClass(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}