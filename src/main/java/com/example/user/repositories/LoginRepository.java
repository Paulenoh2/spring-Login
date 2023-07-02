package com.example.user.repositories;

import com.example.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<User,String> {

 User findUsernameByUsername(String username);

}
