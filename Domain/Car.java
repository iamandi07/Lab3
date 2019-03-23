package Domain;

import java.util.Objects;

public class Car {

    private String id, date, model;                             //purchase date of the car and the distance traveled
    private int distance;
    private boolean warranty;

    public Car(String id, String date, String model, int distance, boolean warranty) {

        this.id = id;
        this.date = date;
        this.model = model;
        this.distance = distance;
        this.warranty = warranty;

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id.equals(car.id);
        }

    public String toString() {
        return "Cake{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", model='" + model+
                ", distance=" + distance +
                ", warranty=" + warranty +
                '}';
    }

    public int hashCode() {
        return Objects.hash(id, date, model, distance, warranty);
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getWarranty() {
        return warranty;
    }

    public void setWaranty(boolean warranty) {
        this.warranty = warranty;
    }
}
