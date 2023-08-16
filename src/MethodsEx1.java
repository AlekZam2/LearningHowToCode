import java.util.Scanner;

public class MethodsEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Please enter a season: 1=Spring 2=Summer 3=Fall 4=Winter");
        String input = scanner.nextLine();

        switch (input){
            case "1":
                printSpring();
                break;
            case "2":
                printSummer();
                break;
            case "3":
                printFall();
                break;
            case "4":
                printWinter();
                break;
            default:
                System.out.println(" Please enter a valid input");

        }
    }

    public static void printSpring(){
        System.out.println("The season is spring" );
    }public static void printSummer(){
        System.out.println("The season is summer" );
    }public static void printFall(){
        System.out.println("The season is fall" );
    }public static void printWinter(){
        System.out.println("The season is winter" );
    }

}
