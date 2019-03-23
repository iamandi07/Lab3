package Domain;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CarValidator {

    public void validate(Car car) {

        String date = car.getDate();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        if (car.getDistance() < 0) {
            throw new RuntimeException("The distance cannot be negative!");
    }
        try {
            format.parse(car.getDate());
            if (date.charAt(0) < '0' || (!Character.isDigit(date.charAt(1)) && !Character.isDigit(date.charAt(1))) ||
                    !Character.isDigit(date.charAt(2)) ||
                    !Character.isDigit(date.charAt(3)) ||
                    !Character.isDigit(date.charAt(4)) ||
                    !Character.isDigit(date.charAt(5))
            );
        } catch (ParseException pe) {
            throw new RuntimeException("The date of registration is not in a correct format!");
        }
    }
}
