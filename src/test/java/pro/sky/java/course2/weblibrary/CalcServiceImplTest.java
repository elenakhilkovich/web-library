package pro.sky.java.course2.weblibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import pro.sky.java.course2.weblibrary.exception.CalculatorIllegalArgumentException;
import pro.sky.java.course2.weblibrary.service.CalcServiceImpl;

import static pro.sky.java.course2.calculator.CalcServiceTest.*;

public class CalcServiceImplTest {
    private final CalcServiceImpl out = new CalcServiceImpl();

    @Test
    public void shouldReturn6() {
        int result = out.plus(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, 6);

    }

    @Test
    public void shouldReturn24() {
        int result = out.plus(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, 24);
    }

    @Test
    public void shouldReturn4() {
        int result = out.minus(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, 4);

    }

    @Test
    public void shouldReturn16() {
        int result = out.minus(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, 16);
    }

    @Test
    public void shouldReturn5() {
        int result = out.multiply(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, 5);

    }

    @Test
    public void shouldReturn80() {
        int result = out.multiply(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, 80);
    }

    @Test
    public void shouldReturn5_() {
        int result = out.divide(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, 5);

    }

    @Test
    public void shouldReturn5__() {
        int result = out.divide(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, 5);
    }
    @Test
    public void shouldTrowIllegalArgumentExceptionWhenSecondNumberIsZero() {
        Assertions.assertThrows(CalculatorIllegalArgumentException.class, () -> out.divide(NUMBER_3, NUMBER_ZERO));
    }
}
