package com.DrLabs.DLA;

import com.DrLabs.DLA.Service.UserService;
import com.DrLabs.DLA.entity.User;
import com.DrLabs.DLA.entity.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUers() {
        System.out.println("Test GetALL");
        return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        return new ResponseEntity<String>(userService.deleteById(id),HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<User> saveUser(@RequestBody User user ){
        return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.OK);

    }

    @PostMapping("/verify")
    public ResponseEntity<UserDto> verifyUserCredentials(@RequestBody UserCredentials userCredentials) {
        UserDto user = userService.verifyUserCredentials(userCredentials);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }



}

