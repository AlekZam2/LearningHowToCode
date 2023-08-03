import java.util.Scanner;

public class ArrayEx13 {
    public static void main(String[] args) {


        String text = "abcde";

        String [] textArr = text.split("");
        String [] newTextArr = new String[textArr.length];

        String [] result = new String[textArr.length];
        for (int i = textArr.length-1; i >= 0 ; i--) {
            newTextArr[i] = textArr[i];

        }



        for (int i = 0; i < textArr.length/2; i++) {
            result[i] = textArr[i];

        }
        for (int i = newTextArr.length/2 -1; i >=0 ; i++) {
            result[i] = textArr[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }







        }


}
