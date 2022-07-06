package com.example.nhom4_quanlytaichinh.repository;


import com.example.nhom4_quanlytaichinh.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String roleName);
}