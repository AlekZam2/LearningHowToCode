import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyCurrent = Double.parseDouble(scanner.nextLine());
        int daysPassed = 0;
        int daysSpend = 0;

        while (moneyCurrent < moneyNeeded) {
            String moneyStatus = scanner.nextLine();
            double moneyAddOrSub = Double.parseDouble(scanner.nextLine());

            if (daysPassed == 5) {
                break;
            }
            daysPassed++;

            if (moneyStatus.equals("spend")) {
                moneyCurrent = moneyCurrent - moneyAddOrSub;
                daysSpend++;
            } else if (moneyStatus.equals("save")) {
                moneyCurrent = moneyCurrent + moneyAddOrSub;
                daysSpend = 0;
            }
        }

        if (moneyNeeded <= moneyCurrent) {
            System.out.println("yes " + daysPassed);
        } else {
            System.out.println("no " + daysPassed);
        }
    }
}
