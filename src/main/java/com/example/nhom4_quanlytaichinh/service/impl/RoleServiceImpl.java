package com.example.nhom4_quanlytaichinh.service.impl;

import com.example.nhom4_quanlytaichinh.repository.RoleRepository;
import com.example.nhom4_quanlytaichinh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nhom4_quanlytaichinh.model.user.Role;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public void save(Role role) {
roleRepository.save(role);
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }


}
