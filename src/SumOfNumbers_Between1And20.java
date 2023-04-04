import java.util.Scanner;

public class SumOfNumbers_Between1And20 {
    public static void main(String[] args) {
        //creating instance of scanner class for user input
        Scanner scanner = new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Please enter the numbers between 1 to 20: ");
        //initialize x variable using scanner class object
        int x = scanner.nextInt();
        //declare result variable
        int result = 0;
        //verifying numbers between 1 and 20 are added and printed
        if (x>=1 && x<=20) {
            for (int i = 0; i <= x; i++) {
               result = result + i;

            }
            System.out.println("The sum of " + x + " numbers is: " + result);
        }
        //numbers entered over 20 are printed as invalid entry
        else{
            System.out.println("This is Invalid Entry");
        }

    }
}


