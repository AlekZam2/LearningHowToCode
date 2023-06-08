import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int newNum = 0;

        while (num > newNum){
            int addedNum = Integer.parseInt(scanner.nextLine());

            newNum += addedNum;

        }

        System.out.println(newNum);



    }
}
