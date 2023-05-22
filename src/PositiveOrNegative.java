import java.util.Scanner;
//         1. Write a Java program to get a number from the user and print whether it is positive or negative.
//
//        Test Data
//        Input number: 35
//        Expected Output :
//        Number is positive

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        int numInput = Integer.parseInt(scanner.nextLine());

        if (numInput > 0){
            System.out.println("Number is positive");
        }else if (numInput < 0){
            System.out.println("Number is negative");
        }else {
            System.out.println(" Number is 0");
        }

    }}
