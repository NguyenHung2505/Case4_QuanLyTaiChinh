package com.example.nhom4_quanlytaichinh.service;



import com.example.nhom4_quanlytaichinh.model.account.Role;


public interface RoleService {
    Iterable<Role> findAll();


    void save(Role role);

    Role findByName(String name);
}
