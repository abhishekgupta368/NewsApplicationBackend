package com.example.TestApi.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
public class NewsSource {
    private String status;
    private List<NewsSourceChild> sources;
}
