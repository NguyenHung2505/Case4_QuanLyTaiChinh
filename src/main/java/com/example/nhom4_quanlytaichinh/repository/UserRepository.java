package com.example.nhom4_quanlytaichinh.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.nhom4_quanlytaichinh.model.user.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}