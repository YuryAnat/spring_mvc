package web.services;

import web.model.Car;

import java.util.List;

public interface CarService {
    void add(Car car);
    List<Car> getCar(int count);
}
