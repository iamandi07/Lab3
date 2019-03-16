package Domain;

public class Car {

    private int id, date, distance;                             //purchase date of the car and the distance traveled
    private String model;
    private boolean waranty;

    public Car(int id, int date, int distance, String model, boolean waranty) {

        this.id = id;
        this.date = date;
        this.distance = distance;
        this.model = model;
        this.waranty = waranty;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
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

    public boolean getWaranty() {
        return waranty;
    }

    public void setWaranty(boolean waranty) {
        this.waranty = waranty;
    }
}
