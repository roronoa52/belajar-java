package belajar.testing;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Sebelum test");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Sesudah test");
    }

    @DisplayName("Test calculator add succes")
    @Test
    public void TestAddSuccess(){
        var result = calculator.add(1,1);
        Assertions.assertEquals(2, result);
    }

    @DisplayName("Test calculator divide succes")
    @Test
    public void TestDivideSuccess(){
        var result = calculator.divide(10,5);
        Assertions.assertEquals(2, result);
    }

    @DisplayName("Test calculator divide failed")
    @Test
    public void TestDivideFailed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(0,5));
    }

    @Disabled
    @Test
    public void TestComingSoon(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(0,5));
    }

    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }
    }

    @Test
    public void testAssumptions(){
        Assumptions.assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }

}
