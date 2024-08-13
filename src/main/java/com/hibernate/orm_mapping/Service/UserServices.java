package com.hibernate.orm_mapping.Service;

import com.hibernate.orm_mapping.Models.OneToOne.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserServices {
    ResponseEntity<User> getUserById(Long id);
    ResponseEntity<User> getUserByUsername(String username);
    List<User> getAllUsers();
    ResponseEntity<User> addUser(User user);
    void deleteUser(Long id);
}
