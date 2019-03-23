package Repository;

import Domain.Car;
import Domain.CarValidator;

import java.util.*;

public class CarRepository {
    private Map<String, Car> storage = new HashMap<String, Car>();
    private CarValidator validator;

    public CarRepository(CarValidator validator) {
        this.validator = validator;
    }

    public Car findById(String id) {
        return storage.get(id);
    }

    public void AddAndUpdate(Car car){
        if (storage.containsKey(car.getId())){
            throw new RuntimeException("A car with that id already exists!");
        }

        validator.validate(car);
        storage.put(car.getId(), car);
    }

    public void Remove(String id) {
        if (!storage.containsKey(id)) {
            throw new RuntimeException(String.format("There is no car with id=%s", id));
        }

        storage.remove(id);
    }

    public List<Car> getAll() {

        return new ArrayList<>(storage.values());
    }
}
