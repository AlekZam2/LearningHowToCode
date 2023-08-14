public class ArraysEx16 {
    public static void main(String[] args) {


        int [] arr = {7,1,13,2,33};

        int lowestDif = Integer.MAX_VALUE;


        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {

                int value = Math.abs(arr[i] - arr[j]);
                if (lowestDif > value){
                    lowestDif = value;

                }


            }


        }
        System.out.println(lowestDif);

    }
}
