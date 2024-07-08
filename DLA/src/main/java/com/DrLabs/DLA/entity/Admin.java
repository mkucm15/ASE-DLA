package com.DrLabs.DLA.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "admins")
public class Admin {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String phoneNumber;
    private String address;
    private Date dateOfBirth;
    private String role;
    private String username;
    private String password;

    //private List<User> users;
   // private List<Doctor> doctors;

    // Constructors, getters, setters, and other methods
}
