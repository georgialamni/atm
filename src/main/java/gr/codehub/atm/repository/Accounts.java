package gr.codehub.atm.repository;

import gr.codehub.atm.model.Account;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Accounts {

    private List<Account> accounts;

    public Accounts(){
        accounts = new ArrayList<>();
    }
}
