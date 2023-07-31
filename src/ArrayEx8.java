public class ArrayEx8 {
    public static void main(String[] args) {

        int[] array = {8, 9, 7, 4, 5, 6, 2, 10, 100,58,69,-7,38,150};

        int maxNum = array[0];
        int minNum = array[0];


        for (int element : array) {
            if (maxNum > element) {
                maxNum = element;
            }if (minNum < element){
                minNum= element;
            }

        }
        System.out.println(minNum);
        System.out.println(maxNum);
    }
}
