package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> listCars = List.of(
            new Car("Psina", 4, 2.5),
            new Car("Sobaka", 4, 3.0),
            new Car("Suchka", 4, 5.0),
            new Car("TvoiaDochka", 0, 100.0),
            new Car("Chlen", 13, 18.0));

    @Override
    public List<Car> getListCar(int number) {
        if(number<0){
            return listCars;
        }
        return listCars.stream().limit(number).collect(Collectors.toList());
    }
}