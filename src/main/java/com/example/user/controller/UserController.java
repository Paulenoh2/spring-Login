package com.example.user.controller;

import com.example.user.entities.User;
import com.example.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/get/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        Optional<User> getUserById = userRepo.findById(id);
        return getUserById;
    }

    @PutMapping("/edit")
    public String updateUser(@RequestBody User user) throws Exception {
        if (user.getId() == 0 && user.getId()== null) {
            throw new Exception("cannot fine user");

            }
             userRepo.save(user);
            return "update successfull";
        }

        @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        userRepo.deleteById(id);
        return "Delete user successfull";
        }


    }


