package com.example.TestApi.Exceptions;

public class SearchResultNotFoundException extends Exception{
    public SearchResultNotFoundException(String message){
        super(message);
    }
}
