package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.dto.FullNameRequest;
import com.example.graphql.dto.StudentResponse;
import com.example.graphql.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final StudentService studentService;

    public String firstQuery() {
        return "Enigma 2137";
    }

    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String fullNameFull(FullNameRequest fullNameRequest) {
        return fullNameRequest.getFirstName() + ":::" + fullNameRequest.getLastName();
    }

    public StudentResponse getStudent(Long id) {
        return new StudentResponse(studentService.getStudentById(id));
    }
}
