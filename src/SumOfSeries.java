import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        //creating instance of scanner class for user input
        Scanner scanner = new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Please enter the number for addition of the series:");
        //initialize number variable using scanner class object
        int number = scanner.nextInt();
        //declare result variable as float
        float result = 0;
        //verifying series is incremented and added
        for (float i = 1; i <= number; i++) {
            result = result + 1 / i;
        }
        System.out.println("The sum of the series upto 1/" +number+ " is: " + result);
    }
}
