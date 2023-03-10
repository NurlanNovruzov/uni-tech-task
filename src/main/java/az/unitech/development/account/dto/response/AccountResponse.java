package az.unitech.development.account.dto.response;

import az.unitech.development.account.dto.AccountDto;
import az.unitech.development.account.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {

    private List<AccountDto> accounts;

    public static AccountResponse of(List<AccountDto> accounts ) {

        return new AccountResponse(accounts );
    }


}