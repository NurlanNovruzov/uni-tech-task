package az.unitech.development.account.error;

public enum RegisterErrorCodes implements ErrorCode{

    PIN_IS_USED,

    PIN_NOT_FOUND;

    @Override
    public String code(){
        return  this.name();
    }


}
