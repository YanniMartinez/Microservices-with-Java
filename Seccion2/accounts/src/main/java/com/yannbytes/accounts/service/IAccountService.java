package com.yannbytes.accounts.service;

import com.yannbytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * @param customerDto customerDto Object
     * */
    default void createAccount(CustomerDto customerDto) {}

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
}
