package web.model;

import java.util.List;

public class Car {
private String model;
private String color;
private int number;

public Car(){};

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return ("Car: " + this.model + " " + this.color + " " + this.number);
    }

    public void showCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
