import java.util.Objects;
import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.next());
        int moneyForFlowers = Integer.parseInt(scanner.next());

        double finalPrice = 0;


        if (Objects.equals(typeFlowers, "Roses")) {
            finalPrice = countFlowers * 5;
            if (countFlowers > 80) {
                finalPrice = finalPrice - (finalPrice * 0.10);
            }
        } else if (Objects.equals(typeFlowers, "Dahlias")) {
            finalPrice = countFlowers * 3.80;
            if (countFlowers > 90) {
                finalPrice = finalPrice - (finalPrice * 0.15);
            }


        } else if (Objects.equals(typeFlowers, "Tulips")) {
            finalPrice = countFlowers * 2.80;
            if (countFlowers > 80) {
                finalPrice = finalPrice - (finalPrice * 0.15);
            }


        } else if (Objects.equals(typeFlowers, "Narcissus")) {
            finalPrice = countFlowers * 3;
            if (countFlowers < 120) {
                finalPrice = finalPrice - (finalPrice * 0.15);
            }

        } else if (Objects.equals(typeFlowers, "Gladiolus")) {
            finalPrice = countFlowers * 2.50;
            if (countFlowers < 80) {
                finalPrice = finalPrice - (finalPrice * 0.20);
            }
        }
        double calculation = Math.abs(finalPrice - moneyForFlowers);

        if (moneyForFlowers >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlowers, calculation);
        } else {
            System.out.printf( "Not enough money, you need %.2f leva more.", calculation);
        }
    }
}
