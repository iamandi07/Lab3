package Repository;

import Domain.Transaction;

import java.util.*;

public class TransactionRepository {
    private Map<Integer, Transaction> storage = new HashMap<>();

    public void add(Transaction transaction){
        storage.put(transaction.getId(), transaction);
    }

    public List<Transaction> getAll() {

        return new ArrayList<>(storage.values());
    }
}
