package Repository;

import Domain.Car;
import Domain.CarValidator;

import java.util.*;

public class CarRepository {
    private Map<Integer, Car> storage = new HashMap<>();
    private CarValidator validator;

    public CarRepository(CarValidator validator) {
        this.validator = validator;
    }

    public void add(Car car){
        if (storage.containsKey(car.getId())){
            throw new RuntimeException("A car with that id already exists!");
        }

        validator.validate(car);
        storage.put(car.getId(), car);
    }

    public List<Car> getAll() {

        return new ArrayList<>(storage.values());
    }
}
