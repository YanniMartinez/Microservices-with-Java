package com.yannbytes.accounts.service.impl;

import com.yannbytes.accounts.dto.CustomerDto;
import com.yannbytes.accounts.repository.AccountsRepository;
import com.yannbytes.accounts.repository.CustomerRepository;
import com.yannbytes.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service //Defines as a bean in springboot
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto CustomerDto object
     * */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
