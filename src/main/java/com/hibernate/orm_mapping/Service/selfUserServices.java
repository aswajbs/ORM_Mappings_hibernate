package com.hibernate.orm_mapping.Service;

import com.hibernate.orm_mapping.Models.OneToOne.User;
import com.hibernate.orm_mapping.Repositories.OTORepo.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class selfUserServices implements UserServices {
    private UserRepository userRepository;
    public selfUserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public ResponseEntity<User> getUserById(Long id) {
        ResponseEntity<User> responseEntity = null;
       Optional<User> user = userRepository.findById(id);
       if (user.isPresent()) {
           throw new UserNotFoundException("User "+id+" Not Found");
       }
       responseEntity=new ResponseEntity<>(user.get(), HttpStatus.FOUND);
        return responseEntity;
    }

    @Override
    public ResponseEntity<User> getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public ResponseEntity<User> addUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
