package gr.codehub.atm.repository;

public class NoDebitCardStatus implements IAtmStatus {
    @Override
    public void insertDebitCard() {
        System.out.println("Debit Card is inserted");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("No Debit Card in the slot, so you can't eject card");
    }

    @Override
    public void enterPinAndWithdrawMoney() {
        System.out.println("No Debit Card in ATM, so you can't enter pin and password");
    }
}
