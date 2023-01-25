package az.unitech.development.account.error.validation;



import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommonException extends RuntimeException {

    private final String code;
    private final String message;

    String code(){
        return "frygf";
    }

}

