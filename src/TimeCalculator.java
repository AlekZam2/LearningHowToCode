import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minuteOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());


        int examTotalMinute = hourOfExam * 60 + minuteOfExam;
        int arrivalTotalMinutes = hourOfArrival * 60 + minuteOfArrival;

        int diffMinutes = Math.abs(minuteOfArrival - minuteOfExam);

        if (arrivalTotalMinutes > examTotalMinute) {
            System.out.println("Late");
            if (diffMinutes < 60) {
                System.out.printf("%d minutes after the start.", diffMinutes);
            } else {
                int hour = diffMinutes / 60;
                int minutes = diffMinutes % 60;
                System.out.printf("%d:%02d hours after start", hour, minutes);
            }
        } else if (diffMinutes <= 30) {
            System.out.println("On Time");
            if (diffMinutes != 0) {
                System.out.printf("%d minutes before the start.", diffMinutes);
            }

        } else {
            System.out.println("Early");
            if (diffMinutes < 60) {
                System.out.printf("%d minutes before the start.", diffMinutes);
            } else {
                int hour = diffMinutes / 60;
                int minutes = diffMinutes % 60;
                System.out.printf("%d:%02d hours before start", hour, minutes);
            }
        }


    }
}
