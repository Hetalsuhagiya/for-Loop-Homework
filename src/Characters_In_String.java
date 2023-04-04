import java.util.Scanner;

public class Characters_In_String {
    public static void main(String[] args) {
        //create object for Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String: ");//acknowledge user what to enter
        String name = scanner.nextLine();//initialize name using scanner object
        //declare variables
        char character = 'a';
        int result = 0;
        for (int i = 0; i < name.length(); i++) {//verifying the total length of the string name
            if (name.charAt(i) == character) {// findiing if the character in the string is 'a'
                result = result + 1;//adding numbers of character 'a' to get the total
            }
        }
        System.out.println("The number of the character 'a' in the String are: " + result);
    }
}