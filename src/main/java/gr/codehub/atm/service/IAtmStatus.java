package gr.codehub.atm.service;

public interface IAtmStatus {

    void insertDebitCard();

    void ejectDebitCard();

    void enterPinAndWithdrawMoney();
}
