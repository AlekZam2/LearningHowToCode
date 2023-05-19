import java.util.Scanner;

public class MovieCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int staff = Integer.parseInt(scanner.nextLine());
        double clothing = Double.parseDouble(scanner.nextLine());


        double decor = money - (money * 0.90);


        if(staff > 150 ){
            clothing = clothing - (clothing * 0.10);
        }

        double allExpense = staff * clothing;
        double finalExpenses = Math.abs( money - (decor+allExpense));
        

        if( decor + allExpense > money){
            System.out.println(" Not enough money %n");
            System.out.printf("Wingard needs %.2f leva more.", finalExpenses);
        }else {
            System.out.println(" Action");
            System.out.printf("Wingard starts filming with %.2f leva left.", finalExpenses);

        }


    }
}
