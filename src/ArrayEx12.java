import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "123456";

        String[] element = line.split("") ;
        int[] number = new int[element.length];

        for (int i = 0; i < number.length; i++) {

            number[i] = Integer.parseInt(element[i]);

            System.out.println(number[i]);





        }

        }
}
