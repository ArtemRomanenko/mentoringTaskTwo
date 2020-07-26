package calculatorTests;

import calculatorLogic.CalculatorRun;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CombineTest {
    CalculatorRun calculatorRun;

    @BeforeMethod
    public void initialization() {
        calculatorRun = new CalculatorRun();
    }

    @Test(dataProvider = "dataForCombine")
    public void combine(double a, double b, double c) {
        assertEquals(calculatorRun.calculation(a, b, '+'), c);
    }

    @DataProvider
    private Object[][] dataForCombine() {
        return new Object[][]{
                {3, 4, 7},
                {-3, -4, -7},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE + Double.MIN_VALUE}
        };
    }
}
