package gr.codehub.atm.repository;

import gr.codehub.atm.model.Account;
import lombok.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class Accounts {

    private List<Account> accounts;

    public Accounts() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public Account searchById(int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst()
                .get()
                ;
    }

    public Accounts readAccounts(String filenameAccounts) throws FileNotFoundException {
        Accounts accounts = new Accounts();
        Scanner scanner = new Scanner(new File(filenameAccounts));
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String [] words = line.split(",");
            Account account = new Account();
            account.setId(Integer.parseInt(words[0].trim()));
            account.setNumber(words[1].trim());
            account.setHolder(words[2].trim());
            account.setBalance(Double.parseDouble(words[3].trim()));
            accounts.addAccount(account);
        }
        scanner.close();
        System.out.println("accounts");
        System.out.println(accounts);

        return accounts;
    }
}
