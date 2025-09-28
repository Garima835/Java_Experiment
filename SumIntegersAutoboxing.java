import java.util.ArrayList;
import java.util.Scanner;

public class SumIntegersAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by space:");
        String inputLine = sc.nextLine();

        // Split the input string into tokens
        String[] tokens = inputLine.split("\\s+");

        // Parse strings into Integers (autoboxing happens automatically)
        for (String token : tokens) {
            try {
                int num = Integer.parseInt(token); // String parsing
                numbers.add(num); // Autoboxing: int -> Integer
            } catch (NumberFormatException e) {
                System.out.println(token + " is not a valid integer.");
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }
        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
