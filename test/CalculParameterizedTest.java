import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculParameterizedTest {

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "2, 2", "3, 6", "4, 24"})
    void testFactorielle(int n, int res_attendu) {
        Calcul c = new Calcul();
        int res = c.factorielle(n);
        System.out.println("fact(" + n + ") = " + res + " attendu : "
                + res_attendu);
        assertEquals(res_attendu, res);
    }

   @ParameterizedTest
   @CsvSource({"5, 2 ,2.5","4,2,2","1,1,1","10,1,10"})
    void testDivision(int x,int y, float res_attendu) {
        Calcul c = new Calcul();
        float res = (float)c.division(x,y);
        System.out.println("div (" + x +" , "+ y +") = " + res + " attendu : "
                + res_attendu);
        assertEquals(res_attendu, res);
    }
}