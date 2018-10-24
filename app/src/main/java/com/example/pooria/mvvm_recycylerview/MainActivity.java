package com.example.pooria.mvvm_recycylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.pooria.mvvm_recycylerview.adapter.CustomAdapter;
import com.example.pooria.mvvm_recycylerview.model.News;
import com.example.pooria.mvvm_recycylerview.viewmodel.NewsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;
    private List<NewsModel>newsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsList = new ArrayList<>();
        customAdapter = new CustomAdapter(newsList);
        recyclerView.setAdapter(customAdapter);
        setDate();
    }

    private void setDate() {
        NewsModel newsModel = new NewsModel();
        newsModel.Title = "sadsad";
        newsModel.Desc = "dsfdsgbkfdm vklmnnjadcsk";
        newsList.add(newsModel);
        NewsModel newsModel2 = new NewsModel();
        newsModel.Title = "frghtrjjjjjjj";
        newsModel.Desc = "dsfuik.,lhjhhgdfghvmjdsrrrrrrrrr";
        newsList.add(newsModel2);
    }
}
