import java.util.Scanner;

//Write a program to check whether a character is alphabet or not
public class CharacterIsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Character :");
        char index = scanner.next().charAt(0);

        if (index >= 'a' && index <= 'z' || index >= 'A' && index <= 'Z') {

            System.out.println(" Index is a letter from the Alphabet");
        } else {
            System.out.println(" Index is not a letter in from Alphabet");
        }


    }
}
