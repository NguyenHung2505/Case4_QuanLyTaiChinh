package com.example.nhom4_quanlytaichinh.repository;

import com.example.nhom4_quanlytaichinh.model.ChildCategory;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Locale;

public interface ICategoryRepository extends JpaRepository<ChildCategory, Long> {
}
