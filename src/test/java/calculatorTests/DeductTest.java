package calculatorTests;

import calculatorLogic.CalculatorRun;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeductTest {
    CalculatorRun calculatorRun;

    @BeforeMethod
    public void initialization() {
        calculatorRun = new CalculatorRun();
    }

    @Test(dataProvider = "dataForDeduct")
    public void deduct(double a, double b, double c) {
        assertEquals(calculatorRun.calculation(a, b, '-'), c);
    }

    @DataProvider
    private Object[][] dataForDeduct() {
        return new Object[][]{
                {4, 2, 2},
                {-4, -2, -2},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE - Double.MIN_VALUE}
        };
    }
}
