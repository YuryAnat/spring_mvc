package web.utility;

import web.model.Car;
import web.services.CarService;

public class Utility {
    public static void addCars(CarService carService) {
        carService.add(new Car("lada", 2101, 100d));
        carService.add(new Car("lada", 2110, 400d));
        carService.add(new Car("lada", 2108, 250d));
        carService.add(new Car("lada", 2125, 650d));
        carService.add(new Car("lada", 2160, 1650d));
        carService.add(new Car("lada", 2200, 1799.99d));
    }
}
