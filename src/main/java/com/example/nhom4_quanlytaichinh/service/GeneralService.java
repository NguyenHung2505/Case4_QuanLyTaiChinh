package com.example.nhom4_quanlytaichinh.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface GeneralService<A>{
    List<A> findAll();

    Optional<A> findById(Long id);

    A save(A a);

    void remove(Long id);
}
