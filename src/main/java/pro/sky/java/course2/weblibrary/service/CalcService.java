package pro.sky.java.course2.weblibrary.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String showWelcome() {
        return "Добро пожаловать в калькулятор!";
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public String divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 + "/" + num2 + "=" + num1 / num2;
        } else {
            return "На ноль делить нельзя!";
        }
    }

}
