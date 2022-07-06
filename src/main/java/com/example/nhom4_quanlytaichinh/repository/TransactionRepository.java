package com.example.nhom4_quanlytaichinh.repository;

import com.example.nhom4_quanlytaichinh.model.account.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction , Long> {
}
