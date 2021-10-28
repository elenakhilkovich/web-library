package pro.sky.java.course2.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.weblibrary.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalcService calc;

    public CalculatorController (CalcService calc ){
    this.calc = calc;}

    @GetMapping
    public String ShowWelcome() {
        return calc.showWelcome();
    }

    @GetMapping("/plus")
    public String calcplus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "+" + num2 + " = " + calc.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String calcminus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "-" + num2 + " = " + calc.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "*" + num2 + " = " + calc.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String calcDivide(@RequestParam int num1, @RequestParam int num2) {
        return  calc.divide(num1, num2);
    }
}
