import java.util.Scanner;

//3. Write a Java program that takes three numbers from the user and prints the greatest number.
//
//        Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output :
//        The greatest: 87
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        int input3 = Integer.parseInt(scanner.nextLine());

        if (input1 > input2) {
            System.out.println("The greatest number is " + input1);
        } else if (input3 > input2) {
            System.out.println("The greatest number is " + input3);
        } else {
            System.out.println("The greatest number is " + input2);
        }


    }
}
