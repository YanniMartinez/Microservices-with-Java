package com.yannbytes.accounts.dto;

import lombok.Data;

@Data //It will generate getter/setter/toString and constructor
//but the constructor dont allow all the fields
public class AccountsDto {

    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    
}
