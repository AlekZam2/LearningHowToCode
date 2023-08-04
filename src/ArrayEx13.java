import java.util.Scanner;

public class ArrayEx13 {
    public static void main(String[] args) {


        String text = "abcde";
        String[] s = text.split("");

        for (int i = 0; i < s.length/2; i++) {
            for (int j = s.length-1; j >= 0 ; j--) {
                String temp = s[i];

                s[i] = s[j];

                s[j] = temp;
            }
            String reversedText = String.join("", s);
            System.out.println("Reversed string: " + reversedText);

        }

//        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
//            // Use a temporary variable (temp) to store the character at index i.
//            String temp = s[i];
//
//            // Replace the character at index i with the character at index j.
//            s[i] = s[j];
//
//            // Replace the character at index j with the character in the temporary variable (temp).
//            s[j] = temp;
//        }
//        String reversedText = String.join("", s);
//        System.out.println("Reversed string: " + reversedText);

    }

}
