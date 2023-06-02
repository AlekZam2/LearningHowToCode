//Write a program to input week number and print week day


import java.util.Scanner;

public class WeekNumberToWeekDay {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Week Number(1-7): ");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                default:
                    System.out.println("Add a num between 1 -7");
        }

    }
}
