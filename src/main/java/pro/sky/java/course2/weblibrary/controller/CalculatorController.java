package pro.sky.java.course2.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String ShowWelcome() {
        return "Добро пожаловать в калькулятор!";
    }

}
