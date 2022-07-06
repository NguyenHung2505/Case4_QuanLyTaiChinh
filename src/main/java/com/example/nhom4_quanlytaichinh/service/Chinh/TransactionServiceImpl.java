package com.example.nhom4_quanlytaichinh.service.Chinh;

import com.example.nhom4_quanlytaichinh.model.account.Transaction;
import com.example.nhom4_quanlytaichinh.repository.TransactionRepository;
import com.example.nhom4_quanlytaichinh.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Optional<Transaction> findById(Long id) {
        return transactionRepository.findById(id);
    }

    @Override
    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }


    @Override
    public void remove(Long id) {
        transactionRepository.deleteById(id);
    }
}
