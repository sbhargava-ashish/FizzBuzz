import java.util.Scanner;
import java.util.stream.IntStream;

public class Result {

    public static void main(String[] args) {
        System.out.println("Please enter a valid int value between 1 and 20");
        int range = new Scanner(System.in).nextInt();
        if (isValid(range)) {
            IntStream.range(1, range)
                    .mapToObj(i -> i % 3 == 0 ?  (i % 5 == 0 ? "FizzBuzz" : "Fizz")  :   (i % 5 == 0 ? "Buzz" : i))
                    .forEach(System.out::println);
        }
    }

    private static boolean isValid(int range) {
        return range > 0 ? true : false;
    }
}
