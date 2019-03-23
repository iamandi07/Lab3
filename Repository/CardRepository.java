package Repository;

import Domain.Card;
import Domain.CardValidator;

import java.util.*;

public class CardRepository {
    private Map<String, Card> storage = new HashMap<String, Card>();
    private CardValidator validator;

    public CardRepository(CardValidator validator) {
        this.validator = validator;
    }

    public Card findById(String id) {
        return storage.get(id);
    }

    public void AddAndUpdate(Card card){
        if (storage.containsKey(card.getId())){
            throw new RuntimeException("The card with that id already exists!");
        }

        validator.validate(card);
        storage.put(card.getId(), card);
    }

    public void Remove(String cnp) {
        if (!storage.containsKey(cnp)) {
            throw new RuntimeException(String.format("There is no car with CNP=%s", cnp));
        }

        storage.remove(cnp);
    }
    public List<Card> getAll() {

        return new ArrayList<>(storage.values());
    }
}

