package calculatorTests;

import calculatorLogic.CalculatorRun;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultiplyTest {
    CalculatorRun calculatorRun;

    @BeforeMethod
    public void initialization() {
        calculatorRun = new CalculatorRun();
    }

    @Test(dataProvider = "dataForMultiply")
    public void multiply(double a, double b, double c) {
        assertEquals(calculatorRun.calculation(a, b, '*'), c);
    }

    @DataProvider
    private Object[][] dataForMultiply() {
        return new Object[][]{
                {4, 2, 8},
                {-4, -2, 8},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE * Double.MIN_VALUE}
        };
    }
}
