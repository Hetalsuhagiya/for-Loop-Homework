import java.util.Scanner;

public class ReverseNumbers {
    //creating object of scanner class for user input
    Scanner scanner = new Scanner(System.in);
    int reversen1 = 0;//declare variable
//non-static method
    public void printReverseNumbers() {
        System.out.println("Enter the numbers: ");
         int n= scanner.nextInt();//initialize n variable using scanner class object
        //initializing number, checking boolean condition & decrementing value by division
        for (int i =n; i !=0; i= i/10) {
            //assigning remainder value to m
            int m = i % 10;
            //multiplying reversed number by 10 and then adding remainder to assign new value to reversed numbers
            reversen1 = reversen1 * 10 + m;
        }
        System.out.println("Numbers in reverse order are: " + reversen1);
        }
//main method
    public static void main(String[] args) {
        //creating class object to call non-static method in static method
        ReverseNumbers reverseNumbers = new ReverseNumbers();
        reverseNumbers.printReverseNumbers();//calling method using class object

    }
}