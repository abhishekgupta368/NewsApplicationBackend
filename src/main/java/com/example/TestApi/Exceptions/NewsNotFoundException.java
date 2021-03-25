package com.example.TestApi.Exceptions;

import com.example.TestApi.model.News;

public class NewsNotFoundException extends Exception{
    public NewsNotFoundException(String message){
        super(message);
    }
}
