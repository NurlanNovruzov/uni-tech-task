package az.unitech.development.account.dto.request;


import az.unitech.development.account.error.validation.ErrorMessages;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginAccountDto {

    @NotBlank(message = ErrorMessages.CUSTOMER_ID_NOT_DEFINED)
    private Long customerId;

    @NotBlank(message = ErrorMessages.PASSWORD_NOT_DEFINED)
    private String password;


}
