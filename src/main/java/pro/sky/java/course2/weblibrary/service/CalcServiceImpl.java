package pro.sky.java.course2.weblibrary.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.weblibrary.exception.CalculatorIllegalArgumentException;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new CalculatorIllegalArgumentException();
        }
        return num1 / num2;
    }

}

