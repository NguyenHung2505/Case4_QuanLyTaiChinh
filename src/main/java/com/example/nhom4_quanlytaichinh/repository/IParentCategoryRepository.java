package com.example.nhom4_quanlytaichinh.repository;

import com.example.nhom4_quanlytaichinh.model.ParentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParentCategoryRepository extends JpaRepository<ParentCategory, Long> {
}
