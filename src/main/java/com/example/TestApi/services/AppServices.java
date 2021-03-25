package com.example.TestApi.services;

import com.example.TestApi.model.ConstructUrl;
import com.example.TestApi.model.News;
import com.example.TestApi.model.NewsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppServices {

    @Autowired
    RestTemplate restTemplate;
    public String ApiKey = "Get your key";
    public String BaseUri = "https://newsapi.org/v2/everything?q=";
    public String TopNewsUri = "https://newsapi.org/v2/top-headlines?country=us&apiKey=";
    public String SourceUri = "https://newsapi.org/v2/sources?apiKey=";

    public News getTopNewsService(){
        News result = restTemplate.getForObject(TopNewsUri+this.ApiKey, News.class);
        return result;
    }

    public NewsSource getAllSourceServices(){
        NewsSource result = restTemplate.getForObject(SourceUri+this.ApiKey, NewsSource.class);
        return result;
    }

    public News getSearchResult(String query){
//        String searchQueryUrl = this.BaseUri+query+"&apiKey="+this.ApiKey;
        String searchQueryUrl = new ConstructUrl(this.BaseUri,query,this.ApiKey).getUrl();
        News result = restTemplate.getForObject(this.preProcessQuery(searchQueryUrl), News.class);
        return result;
    }

    public String preProcessQuery(String query){
        String[]q = query.trim().split(" ");
        return String.join("%20",q);
    }
}
