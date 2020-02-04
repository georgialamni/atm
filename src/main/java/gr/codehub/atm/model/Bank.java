package gr.codehub.atm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Bank {

    private Atm atm;
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(Account customer1) {
    }
}
