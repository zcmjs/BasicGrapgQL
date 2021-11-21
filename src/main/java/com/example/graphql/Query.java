package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.dto.FullNameRequest;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String firstQuery() {
        return "Enigma 2137";
    }

    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String fullNameFull(FullNameRequest fullNameRequest) {
        return fullNameRequest.getFirstName() + ":::" + fullNameRequest.getLastName();
    }
}
