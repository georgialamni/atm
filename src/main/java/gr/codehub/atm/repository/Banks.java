package gr.codehub.atm.repository;

import gr.codehub.atm.model.Bank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banks {

    private List<Bank> banks;

    public Banks(){
        banks = new ArrayList<>();
    }
}
