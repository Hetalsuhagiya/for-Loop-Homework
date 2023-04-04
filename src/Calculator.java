import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//create object of scanner class for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");//acknowledge user what to enter
        int num1 = scanner.nextInt();//initialize num1 using scanner object
        System.out.println("Please enter the second number:");//acknowledge user what to enter
        int num2 = scanner.nextInt();//initialize num2 using scanner object
        System.out.println("Choose and Enter the type of operation you want to perform from (+,_,*,/):");
        char op = scanner.next().charAt(0);//initialize char using scanner object

        //calculate addition,subtraction,multiplication or division of two numbers
        int addition = num1+num2;
        int subtraction = num1-num2;
        int multiplication = num1*num2;
        double division = num1*1.0/num2;
        //calculate operation as per user input
        switch(op){
            case'+':
                System.out.println(addition);
                break;
            case'-':
                System.out.println(subtraction);
                break;
            case'*':
                System.out.println(multiplication);
                break;
            case'/':
                System.out.println(division);
                break;
            default:
                System.out.println("This is invalid Entry");
                break;
        }

    }

}
