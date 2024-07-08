package com.DrLabs.DLA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    //private String firstName;
   // private String lastName;
   // private int age;
   // private String sex;
  //  private String phoneNumber;
    //private String address;
    private String username;
    private String password;

    public UserDto(String firstName, String lastName, int age, String sex, String phoneNumber, String address, String username, String password) {
    }

    // Constructors, getters, setters, and other methods



    // Getters and setters (omitted for brevity, but they should be present)
}

