public class ArraysEx15 {
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6};

        int odd = 0;
        int even = 0;


        for (int i = 0; i < input.length; i++) {

            if ( input[i] %2 == 0){
                even = even + input[i];
            }else {
                odd = odd + input[i];
            }
        }

        System.out.println(even - odd);

    }
}
