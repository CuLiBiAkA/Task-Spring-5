package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {


    @GetMapping(value = "/car")
    public String createCarsFoNumber(@RequestParam(value = "count", required = false) Integer number, Model model) {

        List<Car> listCars = new ArrayList<>();
        listCars.add(0, new Car("Lada", 21010, 1.3));
        listCars.add(1, new Car("Zaz", 44215, 0.9));
        listCars.add(2, new Car("Kamaz", 43114, 10.0));
        listCars.add(3, new Car("Koni", 1010, 0.04));
        listCars.add(4, new Car("Fut", 1, 0.001));

        System.out.println(number);
        if (number != null && number < 5) {
            List<Car> listCarsForNumber = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                listCarsForNumber.add(listCars.get(i));
            }
            model.addAttribute("car", listCarsForNumber.toString());
        } else {
            model.addAttribute("car", listCars.toString());
            return "car";
        }
        return "car";
    }
}

