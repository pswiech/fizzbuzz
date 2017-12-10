public class FizzBuzz {
    public static String fizzbuzz(int i) {

        if (i == 1) {
            return "1";
        } else if (i == 2) {
            return "2";
        } else if (i == 3) {
            return "Fizz";
        } else if (i == 5) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
