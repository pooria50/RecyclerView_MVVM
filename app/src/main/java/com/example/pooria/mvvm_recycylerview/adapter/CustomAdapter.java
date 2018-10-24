package com.example.pooria.mvvm_recycylerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pooria.mvvm_recycylerview.R;
import com.example.pooria.mvvm_recycylerview.databinding.NewsBinding;
import com.example.pooria.mvvm_recycylerview.model.News;
import com.example.pooria.mvvm_recycylerview.viewmodel.NewsModel;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {
    public CustomAdapter(List<NewsModel> newsList) {
        this.newsList = newsList;
    }

    private List<NewsModel> newsList;
    private LayoutInflater layoutInflater;

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.innerlayout, parent, false);
        //return new CustomView(view);

        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater, parent, false);

        return new CustomView(newsBinding);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView customView, int i) {
            /*News news = newsList.get(i);
            customView.title.setText(news.getTitle());
            customView.desc.setText(news.getDesc());*/

        NewsModel newsModel = newsList.get(i);
        customView.bind(newsModel);

    }

    public class CustomView extends RecyclerView.ViewHolder {
        private NewsBinding newsBinding;
        //TextView title,desc;
        public CustomView(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            this.newsBinding = newsBinding;
            //title = itemView.findViewById(R.id.titleval);
            //desc = itemView.findViewById(R.id.descval);
        }

        public void bind(NewsModel newsModel) {
            this.newsBinding.setNewsview(newsModel);
        }

        public NewsBinding getNewsBinding(){
            return newsBinding;
        }
    }

}
