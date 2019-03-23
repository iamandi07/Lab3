package Domain;

import java.lang.String;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class CardValidator {


    public void validate(Card card) {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        if (card.getCnp().length() != 13) {
            throw new RuntimeException("The personal number need to contain 13 numbers");
        }
        String number = card.getCnp();

        if (number.charAt(0) < '1' || number.charAt(0) > '8'  ||
                (number.charAt(1) < '0' || number.charAt(1) > '9' ) ||
                (number.charAt(2) < '1' || number.charAt(2) > '9' ) ||
                (number.charAt(3) < '0' || number.charAt(3) > '1' ) ||
                (number.charAt(4) < '0' || number.charAt(4) > '9' ) ||
                (number.charAt(5) < '0' || number.charAt(5) > '1' ) ||
                (number.charAt(6) < '0' || number.charAt(6) > '9' ) ||
                (number.charAt(7) < '1' || number.charAt(7) > '5' ) ||
                (number.charAt(8) < '1' || number.charAt(8) > '9' ) ||
                (number.charAt(9) < '0' || number.charAt(9) > '9' ) ||
                (number.charAt(10) < '1' || number.charAt(10) > '9' ) ||
                (number.charAt(11) < '1' || number.charAt(11) > '9' ) ||
                (number.charAt(12) < '1' || number.charAt(12) > '9' ))
                 {
            throw new RuntimeException("The CNP is not valid");
        }

        try {
            format.parse(card.getBdate());
        } catch (ParseException pe) {
            throw new RuntimeException("The birthday format is not good!");
        }

        try {
            format.parse(card.getRdate());
        } catch (ParseException pe) {
            throw new RuntimeException("The date of registration is not in a correct format!");
        }
    }
}