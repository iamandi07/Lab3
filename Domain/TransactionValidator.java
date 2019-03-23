package Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TransactionValidator {

    public void validate(Transaction transaction) {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        if (transaction.getSumservice() <= 0) {
            throw new RuntimeException("The number of items must be at least 1.");
        }
        try {
            format.parse(transaction.getDate());
        } catch (ParseException pe) {
            throw new RuntimeException("The transaction date is not in a correct format!");
        }
        SimpleDateFormat format2 = new SimpleDateFormat("HH.MIN.");
        try {
            format2.parse(transaction.getHour());
        } catch (ParseException pe) {
            throw new RuntimeException("The transaction date is not in a correct format!");
        }
    }
}
