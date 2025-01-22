package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Ford", "Model-T", 1908));
        cars.add(new Car("Volkswagen", "Beetle", 1963));
        cars.add(new Car("Ferrari", "250-GTO", 1962));
        cars.add(new Car("Porsche", "911", 1964));
        cars.add(new Car("Chevrolet", "Corvette-Stingray", 1963));
    }

    @Override
    public List<Car> getCars(int count) {
        return count >= cars.size() ? cars : cars.subList(0, count);
    }
}
