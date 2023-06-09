import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double change = Double.parseDouble(scanner.nextLine());

        int fullChange = (int)(change * 100);

        int ongoingCount = 0;


        while(fullChange > 0) {
            if(fullChange >= 200) {
            fullChange -= 200;
            ongoingCount++;
            }else if (fullChange >= 100){
                fullChange -= 100;
                ongoingCount++;
            } else if (fullChange >= 50) {
                fullChange -= 50;
                ongoingCount++;
            }else if (fullChange >= 20) {
                fullChange -= 20;
                ongoingCount++;
            }else if (fullChange >= 10) {
                fullChange -= 10;
                ongoingCount++;
            }else if (fullChange >= 5) {
                fullChange -= 5;
                ongoingCount++;
            }else if (fullChange >= 2) {
                fullChange -= 2;
                ongoingCount++;
            }else if (fullChange >= 1) {
                fullChange -= 1;
                ongoingCount++;
            }
        }
        System.out.println(ongoingCount);


    }
}
