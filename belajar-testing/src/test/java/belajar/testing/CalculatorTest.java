package belajar.testing;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void TestAddSuccess(){
        var result = calculator.add(1,1);
    }

}
