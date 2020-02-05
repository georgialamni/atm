package gr.codehub.atm.repository;

import gr.codehub.atm.model.Account;
import gr.codehub.atm.model.Bank;

import java.util.Scanner;

public class AtmInformationReader {

    private Scanner s;
    AtmInformationReader newATM = new AtmInformationReader();

    public AtmInformationReader() {
        s = new Scanner(System.in);
    }

    public void menu() {

        System.out.println("Welcome to the bank");
        System.out.println("Choose one of the following options: ");
        System.out.println("1 - Sign In");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Display Account Info");
        System.out.println("5 - Exit");
    }

    public void verifyCustomer() {

        Account customer1 = new Account(999, "Georgia", 100.25, 9999);
        Bank theBank = new Bank();
        theBank.createAccount(customer1);

        System.out.println("Enter Account Number: ");
        String accountNumber;
        accountNumber = s.nextLine();
        System.out.println("Enter password");
        String password;
        password = s.nextLine();

        if (accountNumber.equals(customer1.getAccountNumber()) && password.equals(customer1.getPassword())) {
            menu();
        } else {
            System.out.println("ERROR: Either account number or passcode is not correct.");
        }
    }

}
