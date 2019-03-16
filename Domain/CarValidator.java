package Domain;

public class CarValidator {

    public void validate(Car car) {

        if (car.getDistance() < 0) {
            throw new RuntimeException("The distance cannot be negative!");
        }
        if (car.getDate() <= 0) {
            throw new RuntimeException("The distance cannot be negative!");
        }
    }
}
