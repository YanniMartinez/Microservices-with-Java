package com.yannbytes.accounts.service;

import com.yannbytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * @param customerDto customerDto Object
     * */
    default void createAccount(CustomerDto customerDto) {}

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
