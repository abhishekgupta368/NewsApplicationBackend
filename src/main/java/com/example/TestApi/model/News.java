package com.example.TestApi.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
public class News {
    private String status;
    private String totalResults;
    List<Article> articles = new ArrayList<>();
}
