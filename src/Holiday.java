import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String type = "";
        double price = 0;

        if( budget <= 100 ) {
            destination = "Bulgaria";
            if (season.equals("summer")){
                type = "Camp";
                price = budget - (budget * 0.70);
            }else{
                type = "Hotel";
                price = budget - (budget * 0.30);
            }
        }else if( budget <= 1000 ) {
            destination = "Balkans";
            if (season.equals("summer")){
                type = "Camp";
                price = budget - (budget * 0.60);
            }else{
                type = "Hotel";
                price = budget - (budget * 0.20);
            }
        }else if( budget > 1000) {
            destination = "Europe";
            type = "Hotel";
            price = budget - (budget * 0.10);

        }

        System.out.printf( "Somewhere in %s", destination);
        System.out.printf( " %s – %.2f", type, price);


    }
}
