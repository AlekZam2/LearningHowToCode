import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());


        double totalToysPrice = puzzles * 2.60 + talkingDoll * 3 + teddyBear * 4.10 + minion * 8.20 + truck * 2;


        int totalToys = puzzles + teddyBear + talkingDoll + minion + truck;


        if (totalToys >= 50) {
            totalToysPrice = totalToysPrice - (totalToysPrice * 0.25);
        }

        double finalMoney = totalToysPrice - (totalToysPrice * 0.10);

        if (finalMoney >= holidayPrice) {
            double haveMoney = finalMoney - holidayPrice;
            System.out.printf("Yes! %.2f lv left.", haveMoney);
        } else {
            double noMoney = holidayPrice - finalMoney;
            System.out.printf("Not enough money! %.2f lv needed.", noMoney);

        }

    }
}
