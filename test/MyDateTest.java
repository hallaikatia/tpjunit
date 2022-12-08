import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyDateTest {

    @Test
    public void testDay0() {

        MyDate myDate = new MyDate();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myDate.setDay(0);
        });

        String expectedMessage = "Day no valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testDay32() {

        MyDate myDate = new MyDate();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myDate.setDay(32);
        });

        String expectedMessage = "Day no valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void tesDay1  (){
        MyDate myDate = new MyDate();
        myDate.setDay(1);
        assertEquals(1,myDate.day);

    }

    @Test
    public void testDay30AndMonth2(){
        MyDate myDate = new MyDate();
        myDate.setMonth(2);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myDate.setDay(30);
        });

        String expectedMessage = "Day no valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testDay31AndMonth11(){

        MyDate myDate = new MyDate();
        myDate.setMonth(11);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myDate.setDay(31);
        });

        String expectedMessage = "Day no valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));


    }

    @Test
    public void testMonth0 (){
        MyDate myDate = new MyDate();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myDate.setMonth(0);
        });

        String expectedMessage = "Month no valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void testMonth13 (){
        MyDate myDate = new MyDate();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myDate.setMonth(13);
        });

        String expectedMessage = "Month no valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void testMonth11  (){
        MyDate myDate = new MyDate();
        myDate.setDay(11);
        assertEquals(11,myDate.day);

    }

    @Test
    public void testMonth12  (){
        MyDate myDate = new MyDate();
        myDate.setDay(12);
        assertEquals(12,myDate.day);

    }

    @Test
    public void testYear0  (){
        MyDate myDate = new MyDate();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myDate.setYear(0);
        });

        String expectedMessage = "Year no valid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));


    }

    @Test
    public void testYear1  (){
        MyDate myDate = new MyDate();
        myDate.setYear(1);
        assertEquals(1,myDate.year);

    }



}

  