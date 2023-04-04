import java.util.Scanner;

public class Numbers_10_Between_Range {
    //create an instance of the Scanner class for user input
    Scanner scanner = new Scanner(System.in);
    //non-static method
    public void print10Numbers(){
        System.out.println("Please enter first number:");//acknowledge the user what to enter
        int n = scanner.nextInt();//initialize value of n using scanner object
        System.out.println("The 10 numbers from number " + n + "are: ");
        //initializing value of the number entered, giving boolean condition and iterating upto next 10 numbers
        for (int i = n; i < n + 10; i++) {
            System.out.println(i);
        }
    }

    //main method
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        Numbers_10_Between_Range numbers_10 = new Numbers_10_Between_Range();
        //calling non-static method using class object
        numbers_10.print10Numbers();
    }

}
