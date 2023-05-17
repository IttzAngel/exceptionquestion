import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean exception = false;

        Scanner myNumber = new Scanner(System.in);

        while (exception == false) {
            try {
                System.out.println("Enter Numerator");
                int numerator = myNumber.nextInt(); // numerator value
                System.out.println("Enter Denominator");
                int denominator = myNumber.nextInt(); // denominator value
                int result = numerator / denominator;
                System.out.println("Result is " + result);
                exception = true;
                System.out.println("Good job!");
            } catch (ArithmeticException arithmeticException) {
                System.out.println("You cannot divide by 0." + '\n' + "Try again.");
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Impossible to do that." + '\n' + "Try again.");
                myNumber.nextLine();
            }

        }

    }


}
