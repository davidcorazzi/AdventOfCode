import org.junit.Assert;
import org.junit.Test;

public class AdventOfCodeTests {

    @Test
    public void testCase1(){
        long mass = 12;
        long expectedResult = 2;
        long result = AdventOfCode.calculateFuel(mass);

        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testCase2() {
        long mass = 14;
        long expectedResult = 2;
        long result = AdventOfCode.calculateFuel(mass);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testCase3() {
        long mass = 1969;
        long expectedResult = 654;
        long result = AdventOfCode.calculateFuel(mass);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testCase4() {
        long mass = 100756;
        long expectedResult = 33583;
        long result = AdventOfCode.calculateFuel(mass);

        Assert.assertEquals(expectedResult, result);
    }
}
