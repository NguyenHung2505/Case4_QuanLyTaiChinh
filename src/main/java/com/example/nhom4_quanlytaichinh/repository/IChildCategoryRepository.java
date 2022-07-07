package com.example.nhom4_quanlytaichinh.repository;

import com.example.nhom4_quanlytaichinh.model.ChildCategory;
import com.example.nhom4_quanlytaichinh.model.ParentCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChildCategoryRepository extends JpaRepository<ChildCategory,Long> {
Iterable<ChildCategory>findAllByParentCategory(ParentCategory parentCategory);
}
