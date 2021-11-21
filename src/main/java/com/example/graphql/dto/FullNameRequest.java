package com.example.graphql.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FullNameRequest {
    private String firstName;
    private String lastName;
}
