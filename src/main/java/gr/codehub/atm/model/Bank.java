package gr.codehub.atm.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Bank {

    private Atm atm;
    private List<Account> accounts;

}
