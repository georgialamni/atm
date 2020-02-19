package gr.codehub.atm.service;

import gr.codehub.atm.model.Account;
import gr.codehub.atm.model.Atm;
import gr.codehub.atm.model.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileNotFoundException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtmService {

    private Atm atm;

    public Account findRelevantAccount(Card card) throws FileNotFoundException {
        AtmInformationReader atmInformationReader = new AtmInformationReader();
        Account account = atmInformationReader
                .readAccounts("accounts.csv")
                .getAccounts()
                .stream()
                .filter(accounte -> accounte.getNumber().equals(atm.getCard().getNumber()))
                .findFirst()
                .get();
        return account;
    }

    public boolean confirmPin(int pin, Card card) throws FileNotFoundException {
        int i = 0;
        boolean pinOk = false;
        Account account = new Account();
        account = findRelevantAccount(card);
        if (account == null) return false;
        do {
            if (account.getPin()==pin){
                pinOk = true;
                i=3;
            } else {
                i += 1;
                System.out.println("Wrong Pin, Try Again");
            }
        }while (i<3);
        return pinOk;
    }
}
