import java.util.Scanner;

public class Fibonacci_Numbers {
    Scanner scanner = new Scanner(System.in);//creating object for scanner class for user input
    //declare variable
    int n;
    int num1 = 0, num2 = 1, sum;

    //non-static method with no return type
    public void printFibonacciNumbers() {
        System.out.println("Please enter the number: ");
        int n = scanner.nextInt();//initializing 'n' using scanner object
        System.out.println("Fibonacci numbers for " + n + " series are:");
        for (int i = num1; i <= n; ++i) {//initialize,check condition & iterate the value of number 1
            sum = num1 + num2;// sum = 0+1=1, //formula to add previous 2 numbers to get next number
            System.out.println(num1);//i=0,

            num1 = num2;// n1=1//assigning value of num2 to num1
            num2 = sum;//n2=1// assigning value of sum to num2

        }
    }

    //calling non-static method in main methos
    public static void main(String[] args) {
        Fibonacci_Numbers fibonacci_numbers = new Fibonacci_Numbers();// creating class object to call non-static method in static method
        fibonacci_numbers.printFibonacciNumbers();//calling method using class object
    }
}


