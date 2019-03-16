package Service;

import Domain.Transaction;
import Repository.TransactionRepository;

import java.util.*;

public class TransactionService {
    private TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public void EnterServiceTransaction(int id, int icc, int piecesum, int date, int hour, double sumservice, boolean clientcard, boolean warranty, String cid) {

        Transaction transaction = new Transaction(id, icc, piecesum, date, hour, sumservice, warranty, clientcard, cid);
        if (clientcard = true){
            sumservice = sumservice-(sumservice/10);
        } else if (clientcard = false) {
            sumservice = sumservice;
        }
        if (warranty = true){
            piecesum = 0;
        }
        double sum = sumservice + piecesum;

        List<Transaction> transactions = repository.getAll();
    }

    public List<Transaction> getAll() {
        return repository.getAll();
    }
}