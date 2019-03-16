package Service;

import Domain.Car;
import Repository.CarRepository;

import java.util.*;

public class CarService {
    private CarRepository repository;

    public CarService(CarRepository repository){
        this.repository = repository;
    }

    public void EnterServiceCar(int id, int date, int distance, String model, boolean waranty) {

        Car car = new Car(id, date, distance, model, waranty);
        List<Car> cars = repository.getAll();
    }

    public List<Car> getAll() {
        return repository.getAll();
    }

    public void EnterServiceCard(int id, int cnp, int bdate, int rdate, String model, String fname, String lname) {
    }
}
