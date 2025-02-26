package com.yannbytes.accounts.service.impl;

import com.yannbytes.accounts.constants.AccountsConstants;
import com.yannbytes.accounts.dto.CustomerDto;
import com.yannbytes.accounts.entity.Accounts;
import com.yannbytes.accounts.entity.Customer;
import com.yannbytes.accounts.mapper.CustomerMapper;
import com.yannbytes.accounts.repository.AccountsRepository;
import com.yannbytes.accounts.repository.CustomerRepository;
import com.yannbytes.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

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
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer  = customerRepository.save(customer);
        //Once the customer is saved, create the account
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    /**
     * @param customer - Customer Object
     * @return the new account details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
