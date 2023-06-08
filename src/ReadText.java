import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String userName = scanner.nextLine();
        String pass = scanner.nextLine();


        String  enteredPass = scanner.nextLine();


        while (!pass.equals(enteredPass)){

            enteredPass = scanner.nextLine();
        }

        System.out.println("Hello " + userName);



    }
}
