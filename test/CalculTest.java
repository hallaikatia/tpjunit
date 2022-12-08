import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTest {



    @RepeatedTest(3)
    @DisplayName("Factorielle de 2")
    void factorielle() {
        Calcul c = new Calcul();
        int res = c.factorielle(2);
        // assertion : argument 1 = argument 2
        assertEquals(2, res, "fact");
    }

    @Test
    @DisplayName("Division de 5")
    void division() {
        Calcul c = new Calcul();
        int x= 5;
        int y=2;
        float res = c.division(x,y);
        assertEquals(2.5, res, "div");
    }



    @Test
    @Disabled
    @DisplayName("Division par 0")
    void divisionPar0() {
        Calcul c = new Calcul();

        Exception exception = assertThrows(ArithmeticException.class, () -> {
                c.division(8, 0);
            });

        String expectedMessage = ("division par 0");
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        }


}