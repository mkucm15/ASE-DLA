package com.DrLabs.DLA.Service;

import com.DrLabs.DLA.Repo.UserRepository;
import com.DrLabs.DLA.UserDto;
import com.DrLabs.DLA.entity.User;
import com.DrLabs.DLA.entity.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public String deleteById(String id) {
        boolean delete=false;
        if(userRepository.existsById(id)){
          userRepository.deleteById(id);
            delete=true;
        } else return "No such Id found";
        return "Netflix "+id+" is successfully deleted";
    }

    public UserDto verifyUserCredentials(UserCredentials userCredentials) {
        // Find user by username and password
        User user = userRepository.findByUsernameAndPassword(userCredentials.getUsername(), userCredentials.getPassword());

        if (user != null) {
            return convertToDto(user);
        } else {
            return null;
        }
    }

    private UserDto convertToDto(User user) {
        // Convert logic here (you may use a mapper library)
        return new UserDto(user.getFirstName(), user.getLastName(), user.getAge(),
                user.getSex(), user.getPhoneNumber(), user.getAddress(),
                user.getUsername(), user.getPassword());
    }

}
