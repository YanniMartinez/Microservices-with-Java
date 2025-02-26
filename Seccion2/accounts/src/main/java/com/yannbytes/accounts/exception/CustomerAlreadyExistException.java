package com.yannbytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Return error 400 bad request
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistException extends RuntimeException{

    //when someone tries to create an account with an email that already exists it will throw this runtime exception
    public CustomerAlreadyExistException(String message) {
        super(message); //from the parent
    }
}
