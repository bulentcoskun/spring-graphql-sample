package com.example.demo.gql.types;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Author {
    Long id;
    String name;
    String email;
}
