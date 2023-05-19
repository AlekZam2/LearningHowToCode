import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        int videoDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakDuration / 8.0 ;
        double restDuration = breakDuration / 4.0;
        double totalBreak = breakDuration - restDuration - lunchDuration;

        if (totalBreak >= videoDuration) {
            double time = Math. round( totalBreak - videoDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", title, time);
        } else {
            double time = Math. round(videoDuration - totalBreak);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", title, time);
        }

    }
}
