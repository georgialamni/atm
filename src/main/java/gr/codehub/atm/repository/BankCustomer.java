package gr.codehub.atm.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankCustomer {

    private String firstName;
    private String lastName;
    private String accountNumber;
    private String password;

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null) {
            this.accountNumber = accountNumber;
        }
    }

    public void setPassword(String password) {
        if (password != null) {
            this.password = password;
        }
    }
}
