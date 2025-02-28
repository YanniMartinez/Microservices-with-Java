package com.yannbytes.accounts.repository;

import com.yannbytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional //Indica que si ocurre algun error o falla en la transaccion se va a hacer un rollback
    @Modifying //This method is going to update the data in the DB
    void deleteByCustomerId(Long customerId); //Delete by customer id custom method
}
