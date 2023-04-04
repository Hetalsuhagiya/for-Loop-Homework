import java.util.Scanner;

public class Month_Names {
    Scanner scanner = new Scanner(System.in);//creating object for scanner class to utilize user input
    int n; //declaring variables

    //non-static method
    public void printMonthNames() {
        System.out.println("Please enter the number from 1 to 12: ");
        int number = scanner.nextInt();//initialize the number variable using scanner object
        //verifying the month names are printed as per the numbers entered using switch break condition
        switch (number) {
            case 1:
                System.out.println(number + " is the month of January");
                break;
            case 2:
                System.out.println(number + " is the month of February");
                break;
            case 3:
                System.out.println(number + " is the month of March");
                break;
            case 4:
                System.out.println(number + " is the month of April");
                break;
            case 5:
                System.out.println(number + " is the month of May");
                break;
            case 6:
                System.out.println(number + " is the month of June");
                break;
            case 7:
                System.out.println(number + " is the month of July");
                break;
            case 8:
                System.out.println(number + " is the month of August");
                break;
            case 9:
                System.out.println(number + " is the month of September");
                break;
            case 10:
                System.out.println(number + " is the month of October");
                break;
            case 11:
                System.out.println(number + " is the month of November");
                break;
            case 12:
                System.out.println(number + " is the month of December");
                break;
            default:
                System.out.println(number + " is Invalid Entry");
                break;
        }

    }

    //main method
    public static void main(String[] args) {
        Month_Names month_names = new Month_Names();//creating class  object to call non-static method in static area
        month_names.printMonthNames();//calling method using class object
    }
}
