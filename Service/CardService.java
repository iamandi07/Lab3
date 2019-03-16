package Service;

import Domain.Card;
import Repository.CardRepository;

import java.util.*;

public class CardService {
    private CardRepository repository;

    public CardService(CardRepository repository) {
        this.repository = repository;
    }

    public void EnterServiceCard(int id, int cnp, int bdate, int rdate, String model, String fname, String lname) {

        Card card = new Card(id, cnp, bdate, rdate, model, fname, lname);
        List<Card> cards = repository.getAll();
    }

    public List<Card> getAll() {
        return repository.getAll();
    }
}