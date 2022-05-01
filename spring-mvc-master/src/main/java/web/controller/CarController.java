package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getTableCarforNumber(@RequestParam(value = "count", required = false, defaultValue = "5") int number, Model model) {
        model.addAttribute("car", carService.getListCar(number));
        return "cars";
    }
}

