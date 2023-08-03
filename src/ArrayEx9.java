public class ArrayEx9 {
    public static void main(String[] args) {
        int [] num = {2,7,11,15};
        int target = 9;
        int sum= 0;


        for (int i = 0; i < num.length; i++){

            int currentSum = num[0] + num[i];
            sum = currentSum;

            if (sum == target){
                System.out.print("["+  num[0] + "," + num[1] + "]");
            }

        }

    }
}
