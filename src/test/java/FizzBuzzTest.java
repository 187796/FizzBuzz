import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by Krystian on 2016-06-15.
 */
public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void assertTrue() {
        assertThat(true, is(true));
    }

    @Test
    public void getResultShouldReturnFizzIfNumberIsDividableBy3() {
        assertEquals("Fizz", fizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("Buzz", fizzBuzz.getResult(5));
    }

    @Test
    public void getResultShouldReturnFizzBuzzIfTheNumberIsDividableBy15() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
        assertEquals("FizzBuzz", fizzBuzz.getResult(30));
    }

    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled(){
        assertEquals("1",fizzBuzz.getResult(1));
        assertEquals("7",fizzBuzz.getResult(7));
        assertEquals("13",fizzBuzz.getResult(13));
    }
}
