import java.util.Scanner;

public class ArrayEx11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num = scanner.nextInt();
        String [] days = { "Monday", "Tuesday","Wednesday"};

        if ( num >= 1 && num <= 7){
            System.out.println(days[num -1]);
        }else {
            System.out.println("Invalid input");
        }

    }
}
