package com.example.TestApi.model;

import lombok.*;
import org.springframework.stereotype.Component;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
public class ConstructUrl {
    private String baseUrl;
    private String query;
    private String apiKey;

    public String getUrl(){
        return this.baseUrl+this.query+"&apiKey="+this.apiKey;
    }
}
