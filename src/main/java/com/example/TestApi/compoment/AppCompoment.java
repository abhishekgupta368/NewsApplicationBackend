package com.example.TestApi.compoment;

import com.example.TestApi.Exceptions.NewsNotFoundException;
import com.example.TestApi.Exceptions.SearchResultNotFoundException;
import com.example.TestApi.model.News;
import com.example.TestApi.model.NewsSource;
import com.example.TestApi.services.AppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppCompoment {

    @Autowired
    AppServices appServices;


    @GetMapping("/getTopNews")
    public ResponseEntity<?> getTopNews() throws NewsNotFoundException {
        try {
            News news = appServices.getTopNewsService();
            return new ResponseEntity<>(news, HttpStatus.CONTINUE);
        }
        catch (Exception e){
            throw new NewsNotFoundException("Exception in top news services");
        }
    }

    @GetMapping("/getSource")
    public ResponseEntity<?> getSource() throws NewsNotFoundException{
        try {
            NewsSource news = appServices.getAllSourceServices();
            return new ResponseEntity<>(news, HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            throw new NewsNotFoundException("Exception in Source services");
        }
    }

    @GetMapping("/getSearchResult")
    public ResponseEntity<?> getSearchResult(@RequestParam("q") String query) throws SearchResultNotFoundException{
        try{
            News news = appServices.getSearchResult(query);
            return new ResponseEntity<>(news,HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            throw new SearchResultNotFoundException("Exception in Search services");
        }
    }

}
