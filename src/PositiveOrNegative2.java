import java.util.Scanner;

public class PositiveOrNegative2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        if (input < 0) {
            System.out.println("Small Negative Number");
        } else if (input > 1000000) {
            System.out.println("Large Positive Number");
            if (input > 0) {
                System.out.println("Positive Number");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
