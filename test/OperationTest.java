import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void addition() {
        Operation operation = new Operation(0,1);
        assertEquals(1,operation.addition());
    }

    @Test
    void substraction() {
        Operation operation = new Operation(1,1);
        assertEquals(0,operation.substraction());

    }

    @Test
    void multiplication() {
        Operation operation = new Operation(0,1);
        assertEquals(0,operation.multiplication());
    }

    @Test
    void division() {
        Operation operation = new Operation(1,2);
        assertEquals(0.5,operation.division());
    }

    @Test
    void divisionPar0() {
        Operation operation = new Operation(1,0);

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            operation.division();
        });

        String expectedMessage = ("division par 0");
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


    

}