package Service;

import Domain.Transaction;
import Repository.TransactionRepository;

import java.util.*;

public class TransactionService {

    private TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public void AddAndUpdate(String id, String icc, String date, String hour, String cid, int piecesum, double sumservice, boolean clientcard, boolean warranty) {

        if (clientcard = true){
            sumservice = 0.1;
        } else if (clientcard = false) {
            sumservice = sumservice;
        }
        if (warranty = true){
            piecesum = 0;
        }
        double sum = sumservice + piecesum;
        Transaction transaction = new Transaction(id, icc, date, hour, cid, piecesum, sumservice, clientcard, warranty);

        repository.AddAndUpdate(transaction);
    }
    public void Remove(String id) {
        repository.Remove(id);
    }

    public List<Transaction> getAll() {
        return repository.getAll();
    }
}