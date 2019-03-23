package Repository;

import Domain.Transaction;
import Domain.TransactionValidator;

import java.util.*;

public class TransactionRepository {

    private Map<String, Transaction> storage = new HashMap<>();
    private TransactionValidator validator;

    public TransactionRepository(TransactionValidator validator) {
        this.validator = validator;
    }

    public void AddAndUpdate(Transaction transaction){

        validator.validate(transaction);
        if (storage.containsKey(transaction.getId())){
            throw new RuntimeException("The transaction with that id already exists!");
        }

        storage.put(transaction.getId(), transaction);
    }

    public void Remove(String id) {
        if (!storage.containsKey(id)) {
            throw new RuntimeException(String.format("There is no car with ID=%s", id));
        }

        storage.remove(id);
    }

    public List<Transaction> getAll() {

        return new ArrayList<>(storage.values());
    }
}

