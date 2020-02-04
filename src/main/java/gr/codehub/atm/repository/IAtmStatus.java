package gr.codehub.atm.repository;

public interface IAtmStatus {

    void insertDebitCard();

    void ejectDebitCard();

    void enterPinAndWithdrawMoney();
}
