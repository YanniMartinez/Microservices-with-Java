package com.yannbytes.accounts.controller;

import com.yannbytes.accounts.constants.AccountsConstants;
import com.yannbytes.accounts.dto.CustomerDto;
import com.yannbytes.accounts.dto.ResponseDto;
import com.yannbytes.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Below annotation is used to mark this class as a controller
@RestController
@RequestMapping(path = "/api", produces = (MediaType.APPLICATION_JSON_VALUE))
@AllArgsConstructor
public class AccountsController {

    //When we have only one constructor @Autowired annotation is not required
    private IAccountService iAccountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        iAccountService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
