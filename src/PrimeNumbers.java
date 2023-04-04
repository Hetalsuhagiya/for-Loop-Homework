import java.util.Scanner;

public class PrimeNumbers {
    //main method
    public static void main(String[] args) {
        //declare variables
        int n;
        int count = 0;
//creating instance of scanner class to utilize user input
        Scanner scanner = new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Please enter the number: ");
        //initializing variable n using scanner object
        n = scanner.nextInt();
        //initializing value from 1,applying boolean condition if less than entered number and then iterating
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)//verifying if number entered is divisible number
                count++;//adding count of divisor
        }
        //verifying condition for prime number using if else statement
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}


