import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter expense: ");
        double expense = Double.parseDouble(scanner.nextLine());

        double total = Math.abs(amount - expense);
        if (amount >= expense){
            System.out.println("Profit of " + total);
        }else {
            System.out.println("Loss of " + total);
        }

    }
}