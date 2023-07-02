package com.example.user.controller;


import com.example.user.entities.User;
import com.example.user.repositories.LoginRepository;
//import com.example.user.service.ImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class LoginController {


    @Autowired
    private LoginRepository repo;
    //   private ImplService userService;


    @PostMapping("/login")

    public ResponseEntity<User> userLogin(@RequestBody User userData) {
        System.out.println("user data" + userData);
        User user = repo.findUsernameByUsername(userData.getUsername());

        if (user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        return (ResponseEntity<User>) ResponseEntity.internalServerError();
    }
    @PostMapping("/create")
    public String create(@RequestBody User user) {
        repo.save(user);
        System.out.println(user);
        //  userService.createUser(user);
        return "New User was created successfull";
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        List<User> users =repo.findAll();
        return users;

    }


}

/*
    @PutMapping("/edit")
    public String updateUser(@RequestBody User user) throws Exception {

        repo.save(user);
        return "update successfull";
      //  if (user.getId() == null) {
          //  throw new Exception("Can not update student with id null.");
     //   }
      //   User  user1 = userService.updateUser(user);
      //  return user1;
    }

    @GetMapping("/get/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        Optional<User> getUserById = repo.findById(id);
        return getUserById;
    }


    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
        return "user successfully deleted";
    }

}
*/