package az.unitech.development.account.controller;

import az.unitech.development.account.dto.AccountDto;
import az.unitech.development.account.dto.request.LoginAccountDto;
import az.unitech.development.account.dto.request.TransferCreateRequest;
import az.unitech.development.account.dto.response.TransferResponse;
import az.unitech.development.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public List<AccountDto> getAllActiveAccountsByCustomerId(
            @RequestHeader(name = "Customer-Id") Long customerId) {
        return accountService.getActiveAccountsByCustomerId(customerId);
    }

    @PostMapping("/registration-account")
    public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody AccountDto accountDto){
        return ResponseEntity.ok(accountService.createAccount(accountDto));
    }

    @GetMapping ("/login-account")
    public ResponseEntity.BodyBuilder login(@Valid @RequestBody LoginAccountDto loginAccountDto){
         accountService.login(loginAccountDto);
        return ResponseEntity.ok();
    }


    @PostMapping("/transfer")
    public TransferResponse makeTransfer(@RequestHeader(name = "Customer-Id") Long customerId,
                                         @Valid @RequestParam TransferCreateRequest request) {
        return accountService.makeTransfer(customerId, request);
    }

}