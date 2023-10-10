package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;

import java.util.Optional;
import java.util.ResourceBundle;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count") Optional <Integer> count, Model model) {
        model.addAttribute("cars", carService.getCars(count.orElse(5)));
        return "cars";
    }
}
