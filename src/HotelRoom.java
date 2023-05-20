import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;


        switch (month) {
            case "May", "October":
                if (duration <= 7) {
                    studioPrice = duration * 50;
                    apartmentPrice = duration * 65;
                } else if (duration > 8 && duration <= 14) {
                    studioPrice = (duration * 50) * 0.95;
                    apartmentPrice = duration * 65;
                } else {
                    studioPrice = (duration * 50) * 0.70;
                    apartmentPrice = (duration * 50) * 0.90;
                }
                break;
            case "June", "September":
                if (duration <= 14) {
                    studioPrice = duration * 75.20;
                    apartmentPrice = duration * 68.70;
                } else {
                    studioPrice = (duration * 75.20) * 0.80;
                    apartmentPrice = (duration * 68.70) * 0.90;
                }
                break;
            case "July", "August":
                if (duration <= 14) {
                    studioPrice = duration * 76;
                    apartmentPrice = duration * 77;
                } else {
                    studioPrice = duration * 76;
                    apartmentPrice = (duration * 77) * 0.90;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv. %n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);


    }
}
