package az.unitech.development.account.error;

public enum LoginErrorCodes implements ErrorCode{

    PIN_OR_PASSWORD_IS_WRONG;

    @Override
    public String code() {
        return this.name();
    }


}
