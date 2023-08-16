package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;
    private String email;

    private String gender;
    private String time;
    private String company;
}
