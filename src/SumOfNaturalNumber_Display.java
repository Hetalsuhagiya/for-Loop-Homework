import java.util.Scanner;

public class SumOfNaturalNumber_Display {
    public static void main(String[] args) {
        //creating object for scanner class for user input
        Scanner scanner = new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Please enter the Number:");
        //initialize number variable using scanner object
        int number = scanner.nextInt();
        //verifying natural numbers are added by using for loop condition
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result = result + i;
        }
        System.out.println("Sum of " + number + " natural numbers are: " + result);
    }

}
