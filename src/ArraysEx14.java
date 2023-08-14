import java.util.Arrays;

public class ArraysEx14 {
    public static void main(String[] args) {

        String text = "abcde";

        String[] newText = text.split("");

        for (int i = 0; i < newText.length/2; i++) {

            int firstHalf = i;
            int secondHalf = newText.length - 1 -i;
            String oldFirstHalf = newText[firstHalf];

            newText[firstHalf]= newText[secondHalf];
            newText[secondHalf] = oldFirstHalf;






        }
        System.out.println(Arrays.toString(newText));








    }
}
