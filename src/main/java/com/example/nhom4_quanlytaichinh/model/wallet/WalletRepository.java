package com.example.nhom4_quanlytaichinh.model.wallet;

import com.example.nhom4_quanlytaichinh.model.wallet.Wallet;
import com.example.nhom4_quanlytaichinh.model.user.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WalletRepository extends PagingAndSortingRepository<Wallet,Long> {
    Iterable<Wallet> findAllByUser(User user);

    Iterable<Wallet> findAllByNameContaining(String name);


}
