package com.hibernate.orm_mapping.Service;

import com.hibernate.orm_mapping.Models.OneToOne.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserServices {
    ResponseEntity<User> getUserById(int id);
    ResponseEntity<User> getUserByUsername(String username);
    List<User> getAllUsers();
    ResponseEntity<User> addUser(User user);
    void deleteUser(int id);
}
