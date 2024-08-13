package com.hibernate.orm_mapping.Repositories.OTORepo;

import com.hibernate.orm_mapping.Models.OneToOne.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Optional<User> findById(Long id);
    User addUser(User user);
    void deleteUser(Long id);
    List<User> findAll();
    List<User> findUserByCity(String city);

}
