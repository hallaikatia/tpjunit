import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyDateParameterizedTest {

    @ParameterizedTest
    @CsvSource({"1, 1"})
    void testDay(int n, int res_attendu) {
        MyDate myDate = new MyDate();
        myDate.setDay(n);
        int res = myDate.day;
        assertEquals(res_attendu, res);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "11, 11", "12, 12"})
    void testMonth(int n, int res_attendu) {
        MyDate myDate = new MyDate();
        myDate.setMonth(n);
        int res = myDate.month;
        assertEquals(res_attendu, res);
    }

    @ParameterizedTest
    @CsvSource({"1, 1"})
    void testYear(int n, int res_attendu) {
        MyDate myDate = new MyDate();
        myDate.setYear(n);
        int res = myDate.year;
        assertEquals(res_attendu, res);
    }


}