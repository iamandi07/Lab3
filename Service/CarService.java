package Service;

import Domain.Car;
import Repository.CarRepository;

import java.util.*;

public class CarService {
    private CarRepository repository;

    public CarService(CarRepository repository){
        this.repository = repository;
    }

    public void AddAndUpdate(String id, String date, int distance, String model, boolean warranty) {
        Car existing = repository.findById(id);

        Car car = new Car(id, date, model, distance, warranty);
        repository.AddAndUpdate(car);
    }

    public void Remove(String id) {
        repository.Remove(id);
    }

    public List<Car> getAll() {
        return repository.getAll();
    }
}
