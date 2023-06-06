import java.util.Scanner;

// Write a program to check whether a number is divisible by 5 and 11 or not
public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num % 5 ==0 && num % 11 == 0){
            System.out.println("Num is divisible");
        }else {
            System.out.println("Num is not divisible");

        }
    }
}
