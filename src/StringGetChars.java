public class StringGetChars {
    public static void main(String[] args) {

        String str = "hello";

        char [] arr = new char[str.length()];
        str.getChars(0, str.length(),arr,0);

        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);

        }

    }
}
