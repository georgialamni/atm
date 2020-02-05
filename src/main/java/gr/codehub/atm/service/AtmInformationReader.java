package gr.codehub.atm.service;

import gr.codehub.atm.model.Account;
import gr.codehub.atm.model.Bank;
import gr.codehub.atm.repository.Banks;

import java.util.Scanner;

public class AtmInformationReader {

    private Scanner s;
    AtmInformationReader newATM = new AtmInformationReader();

    public AtmInformationReader() {
        s = new Scanner(System.in);
    }



    public void verifyCustomer() {

        Account customer1 = new Account("7678", "Georgia", 100.25, 9999);
        Banks theBank = new Banks();
        theBank.createAccount(customer1);

        System.out.println("Enter Account Number: ");
        String accountNumber;
        accountNumber = s.nextLine();
        System.out.println("Enter password");
        String password;
        password = s.nextLine();
//
//        if (accountNumber.equals(customer1.getAccountNumber()) && password.equals(customer1.getPassword())) {
//        } else {
//            System.out.println("ERROR: Either account number or passcode is not correct.");
//        }
    }

}
