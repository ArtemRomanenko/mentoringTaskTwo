package calculatorTests;

import calculatorLogic.CalculatorRun;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivisionTest {
    CalculatorRun calculatorRun;

    @BeforeMethod
    public void initialization(){
        calculatorRun = new CalculatorRun();
    }

    @Test(dataProvider = "dataForDivision")
    public void division(double a, double b, double c){
        assertEquals(calculatorRun.calculation(a, b, '/'), c);
    }

    @DataProvider
    private Object[][] dataForDivision(){
        return new Object[][]{
                {4, 2, 2},
                {-4, -2, 2},
                {4, 0, Double.POSITIVE_INFINITY},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.POSITIVE_INFINITY},
        };
    }
}
