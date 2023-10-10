package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Toyota", "grey", 111));
        carList.add(new Car("Mitsubishi", "black", 876));
        carList.add(new Car("Porshe", "yellow", 432));
        carList.add(new Car("Ferrari", "red", 001));
        carList.add(new Car("BMW", "blue", 583));
    }


    @Override
    public List<Car> getCars(int number) {
        return carList.stream().limit(number).collect(Collectors.toList());
    }
}
