import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

    private LeapYear leapYear =new LeapYear();
    @Test
    public void isLeapYear_forNumbersDivisibleByFour_true() {
        assertEquals(true, leapYear.isLeapYear(2012));
    }
    @Test
    public void isLeapYear_forNumbersNotDivisibleByFour_false() {
        assertEquals(false, leapYear.isLeapYear(1999));
    }
    @Test
    public void isLeapYear_forNumbersNotDivisibleByOneHundred_false() {
        assertEquals(false, leapYear.isLeapYear(1900));
    }
    @Test
    public void isLeapYear_forMultiplesOfFourHundred_true() {
        assertEquals(true, leapYear.isLeapYear(2000));
    }
}
