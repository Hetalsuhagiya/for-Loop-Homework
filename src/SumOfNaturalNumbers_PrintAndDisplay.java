import java.util.Scanner;

public class SumOfNaturalNumbers_PrintAndDisplay {
    public static void main(String[] args) {
        //creating object of scanner class for user input
        Scanner scanner = new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Please enter the number: ");
        //initialize number using scanner class object
        int number = scanner.nextInt();
        //declare result variable
        int result =0;
        //verifying natural numbers are added, numbers added are printed and then result is printed
        for (int i = 0; i <=number ; i++) {
            result = result + i;
            System.out.println(i);
        }
        System.out.println("The sum of the " + number + " natural numbers are: " + result);
    }

}
