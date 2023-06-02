import java.util.Scanner;

//Write a program to find maximum between three numbers

public class FindMaximumBetweenThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number 1 : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the Number 2 : ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the Number 3 : ");
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 && num1 > num3) {
            System.out.println("Max number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Max number is: " + num2);
        } else {
            System.out.println("Max number is: " + num3);
        }

    }
}
