package belajar.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void TestAddSuccess(){
        var result = calculator.add(1,1);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void TestDivideSuccess(){
        var result = calculator.divide(10,5);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void TestDivideFailed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(0,5));
    }

}
