package Service;

import Domain.Card;
import Repository.CardRepository;

import java.util.*;

public class CardService {
    private CardRepository repository;

    public CardService(CardRepository repository) {
        this.repository = repository;
    }

    public void AddAndUpdate(String id, String cnp, String bdate, String rdate) {

        Card existing = repository.findById(id);
        Card card = new Card(id, cnp, bdate, rdate);
        repository.AddAndUpdate(card);
    }

    public void Remove(String cnp) {
        repository.Remove(cnp);
    }

    public List<Card> getAll() {
        return repository.getAll();
    }
}