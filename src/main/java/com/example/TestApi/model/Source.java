package com.example.TestApi.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
public class Source {
    private String id;
    private String name;
}
