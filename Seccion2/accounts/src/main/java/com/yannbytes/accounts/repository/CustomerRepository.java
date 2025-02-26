package com.yannbytes.accounts.repository;

import com.yannbytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//We mention <Customer, Long> here, where Customer is the entity and Long is the type of the primary key
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //Select query using mobile number
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
