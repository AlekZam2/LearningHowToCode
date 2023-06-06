import java.util.Scanner;

public class TotalNumberOfNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int num = Integer.parseInt(scanner.nextLine());

        int amount1 = 0;
        int amount2 = 0;
        int amount5 = 0;
        int amount10 = 0;
        int amount20 = 0;
        int amount50 = 0;
        int amount100 = 0;
        int amount500 = 0;

        if (num >= 500) {
            amount500 = num / 500;
            num = num % 500;
        }
        if (num >= 100) {
            amount100 = num / 100;
            num = num % 100;
        }
        if (num >= 50) {
            amount50 = num / 50;
            num = num % 50;
        }
        if (num >= 20) {
            amount20 = num / 20;
            num = num % 20;
        }
        if (num >= 10) {
            amount10 = num / 10;
            num = num % 10;
        }
        if (num >= 5) {
            amount5 = num / 5;
            num = num % 5;
        }
        if (num >= 2) {
            amount2 = num / 2;
            num = num % 2;
        }
        if (num >= 1) {
            amount1 = num;
        }

        System.out.println(amount500);
        System.out.println(amount100);
        System.out.println(amount50);
        System.out.println(amount20);
        System.out.println(amount10);
        System.out.println(amount5);
        System.out.println(amount2);
        System.out.println(amount1);
    }
}
