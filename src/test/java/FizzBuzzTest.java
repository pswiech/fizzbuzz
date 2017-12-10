import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnOneForOne() throws Exception {
        String actual = FizzBuzz.fizzbuzz(1);
        Assert.assertEquals("1", actual);
    }

    @Test
    public void shouldReturnTwoForTwo() throws Exception {
        String actual = FizzBuzz.fizzbuzz(2);
        Assert.assertEquals("2", actual);
    }

    @Test
    public void shouldReturnFizzForThree() throws Exception {
        String actual = FizzBuzz.fizzbuzz(3);
        Assert.assertEquals("Fizz", actual);
    }

    @Test
    public void shouldReturnBuzzForFive() throws Exception {
        String actual = FizzBuzz.fizzbuzz(5);
        Assert.assertEquals("Buzz", actual);
    }
}

