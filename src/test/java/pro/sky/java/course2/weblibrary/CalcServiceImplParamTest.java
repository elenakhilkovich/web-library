package pro.sky.java.course2.weblibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.weblibrary.service.CalcServiceImpl;

import java.util.stream.Stream;

import static pro.sky.java.course2.calculator.CalcServiceTest.*;

public class CalcServiceImplParamTest {
    private final CalcServiceImpl out = new CalcServiceImpl();

    public static Stream<Arguments> provideParamsForPlusTests() {
        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, PLUS_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, PLUS_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, PLUS_RESULT3)
        );
    }
    public static Stream<Arguments> provideParamsForMinusTests() {

        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, MINUS_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, MINUS_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, MINUS_RESULT3)
        );
    }
    public static Stream<Arguments> provideParamsForMultiplyTests() {

        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, MULTIPLY_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, MULTIPLY_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, MULTIPLY_RESULT3)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {

        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, DIVIDE_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, DIVIDE_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, DIVIDE_RESULT3)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForPlusTests")
    public void shouldGenerateCorrectSumResult(int num1, int num2, int correctResult) {
        int result = out.plus(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void shouldGenerateCorrectDefResult(int num1, int num2, int correctResult) {
        int result = out.minus(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldGenerateCorrectMultiplyResult(int num1, int num2, int correctResult) {
        int result = out.multiply(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldGenerateCorrectDivideResult(int num1, int num2, int correctResult) {
        int result = out.divide(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

}
