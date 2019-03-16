package Repository;

import Domain.Card;
import Domain.CardValidator;

import java.util.*;

public class CardRepository {
    private Map<Integer, Card> storage = new HashMap<>();
    private CardValidator validator;

    public CardRepository(CardValidator validator) {
        this.validator = validator;
    }

    public void add(Card card){
        if (storage.containsKey(card.getId())){
            throw new RuntimeException("The card with that id already exists!");
        }

        validator.validate(card);
        storage.put(card.getId(), card);
    }

    public List<Card> getAll() {

        return new ArrayList<>(storage.values());
    }
}
