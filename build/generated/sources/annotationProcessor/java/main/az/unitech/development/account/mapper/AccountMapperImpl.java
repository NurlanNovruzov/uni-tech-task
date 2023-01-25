package az.unitech.development.account.mapper;

import az.unitech.development.account.dto.AccountDto;
import az.unitech.development.account.model.Account;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-24T13:42:01-0800",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public Account toAccount(AccountDto accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        Account account = new Account();

        account.setAccountNumber( accountDto.getAccountNumber() );
        account.setAmount( accountDto.getAmount() );
        account.setCustomerId( accountDto.getCustomerId() );
        account.setPassword( accountDto.getPassword() );

        return account;
    }

    @Override
    public AccountDto toAccountDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setAccountNumber( account.getAccountNumber() );
        accountDto.setCustomerId( account.getCustomerId() );
        accountDto.setAmount( account.getAmount() );
        accountDto.setPassword( account.getPassword() );

        return accountDto;
    }

    @Override
    public List<AccountDto> toAccountDtoList(List<Account> accounts) {
        if ( accounts == null ) {
            return null;
        }

        List<AccountDto> list = new ArrayList<AccountDto>( accounts.size() );
        for ( Account account : accounts ) {
            list.add( toAccountDto( account ) );
        }

        return list;
    }
}
