package com.example.pooria.mvvm_recycylerview.viewmodel;

import com.example.pooria.mvvm_recycylerview.model.News;

public class NewsModel {
    public String Title, Desc;

    public NewsModel(News news) {
        this.Title = news.Title;
        this.Desc = news.Desc;
    }

    public NewsModel() {
    }

    public String getTitl() {
        return Title;
    }

    public void setTitl(String titl) {
        Title = titl;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
