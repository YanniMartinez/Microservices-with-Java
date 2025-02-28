package com.yannbytes.accounts.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private String name;
    private String email;
    private String mobileNumber;

    //This will be a relation with Accounts with Customer
    private AccountsDto accountsDto;
}
