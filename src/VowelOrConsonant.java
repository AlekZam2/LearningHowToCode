import java.util.Scanner;
//Write a program to input any alphabet and check whether it is vowel or consonant
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Character :");

        char index = scanner.next().charAt(0);
        index = Character.toLowerCase(index);

       if ( index == 'a' || index == 'e' || index == 'i' || index == 'o' || index == 'u'){
           System.out.println("Is a vowel");
        }else {
           System.out.println("Iv not a vowel");
       }

    }
}
