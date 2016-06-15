/**
 * Created by Krystian on 2016-06-15.
 */
public class FizzBuzz {
    private int number;

    public String getResult(int number) {
        this.number = number;
        if(number % 15 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return null;
    }
}
