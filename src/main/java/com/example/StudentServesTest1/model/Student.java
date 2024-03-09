package com.example.StudentServesTest1.model;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Builder
@Data
public class Student {
    private String firstname;
    private String lastname;
    private String email;
    private int age;
    private LocalDate dateBirth;

}
