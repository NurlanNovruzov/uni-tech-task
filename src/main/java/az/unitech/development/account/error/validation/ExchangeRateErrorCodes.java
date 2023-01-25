package az.unitech.development.account.error.validation;

import az.unitech.development.account.error.ErrorCode;

public enum ExchangeRateErrorCodes implements ErrorCode {

    EXCHANGE_RATE_ERROR_CODES;

    @Override
    public String code() {
        return this.name();
    }
}
