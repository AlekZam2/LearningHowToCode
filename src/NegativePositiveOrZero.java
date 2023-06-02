import java.util.Scanner;

//Write a program to check whether a number is negative, positive or zero
public class NegativePositiveOrZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = Integer.parseInt(scanner.nextLine());


        if (num > 0) {
            System.out.println("Num is positive");
        } else if (num < 0) {
            System.out.println("Num is negative");
        } else {
            System.out.println("Num is zero");

        }
    }
}
