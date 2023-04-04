import java.util.Scanner;

public class Factorial_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creating object for scanner class for user input
        System.out.println("Please enter the number: ");// acknowledge user what to enter
        int number = scanner.nextInt();//initialize number using scanner object
        int result = 1;//declare variable
        for (int i = 1; i <=number ; i++) {// initialise,check boolean condition and iterate the number entered
            result = result*i;//multiply the number iterated with the result
        }
        System.out.println("Factorial of number of - " + number + " is " + result);
    }
}
