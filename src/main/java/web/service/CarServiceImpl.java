package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private static List<Car> cars = new ArrayList<>();

    @Autowired
    private CarService carService;


    static {
        cars.add(new Car("Toyota", "grey", 432));
        cars.add(new Car("Mitsubishi", "red", 284));
        cars.add(new Car("Ferrari", "red", 986));
        cars.add(new Car("BMW", "blue", 827));
        cars.add(new Car("Giguli", "cherry", 001));
    }
    @Override
    public List<Car> getCars(int number) {
        return carService.getCars(number);
    }
}
