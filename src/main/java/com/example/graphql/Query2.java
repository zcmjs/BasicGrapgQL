package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query2 implements GraphQLQueryResolver {

    public String firstQuery2() {
        return "Enigma 7312";
    }

}
