import java.util.Scanner;
//Write a program to check whether a character is uppercase or lowercase alphabet
public class UpperOrLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Character:");
        char index = scanner.next().charAt(0);

        if (index >= 'a' && index <= 'z') {
            System.out.println("lower");

        }else {
            System.out.println("UPPER");
        }
    }
}
