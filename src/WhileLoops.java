import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (num >= 0){
            System.out.println(num);
            num--;
        }
    }
}
