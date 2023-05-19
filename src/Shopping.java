import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        int videoCardPrice = videoCard * 250;
        double processorPrice = videoCardPrice - (videoCardPrice * 0.65);
        double ramPrice = videoCardPrice - (videoCardPrice * 0.90);
        double finalProcessor = processor * processorPrice;
        double finalRam = ram * ramPrice;
        double totalPrice = finalRam + finalProcessor + videoCardPrice;

        if (videoCard > processor){
            totalPrice = totalPrice - ( totalPrice * 0.15);
        }


        if( totalPrice <= budget){
            double calculation = (budget - totalPrice);

            System.out.printf("You have %.2f leva left!",calculation);
        }else{
            double calculation = (totalPrice - budget);

            System.out.printf("Not enough money! You need %.2f leva more!",calculation);
        }


    }
}

