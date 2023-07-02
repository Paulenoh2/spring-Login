
/*
package com.example.user.service;

import com.example.user.entities.User;
import com.example.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Service
public class ImplService implements Service {


  @Autowired
  private UserRepository userRepo;





    public ResponseEntity<User> userLogin(User userData) {
        System.out.println("user data" + userData);
        User user = userRepo.findUserByUsername(userData.getUsername());

        if (user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        return (ResponseEntity<User>) ResponseEntity.internalServerError();
    }



















    @Override
    public User createUser(User user) {
        User create = userRepo.save(user);
        return create;
    }

    public  User updateUser(User user) {
         User update= userRepo.save(user);
        return update;

    }

    @Override
    public Optional<User> getUserById(Long id) {
        Optional<User> getById = userRepo.findById(id);
        return getById;
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> getUsers = userRepo.findAll();
        return getUsers;
    }
}
*/