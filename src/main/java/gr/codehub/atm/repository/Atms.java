package gr.codehub.atm.repository;

import gr.codehub.atm.model.Atm;
import gr.codehub.atm.model.Card;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Atms {

    private List<Atm> atms;
    private Card insertedCard;

    public Atms(){
        atms = new ArrayList<>();
    }

    public boolean insert(Card card){
        this.insertedCard = card;
        return true;
    }
}
