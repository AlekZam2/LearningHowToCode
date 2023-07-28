public class ArrayEx6 {
    public static void main(String[] args) {

        int[][] array = new int[4][2];

        array[0][0] = 1;
        array[1][0] = 2;
        array[2][0] = 3;
        array[3][0] = 4;

        array[0][1] = 23;
        array[1][1] = 67;
        array[2][1] = 68;
        array[3][1] = 91;

        for (int i = 0; i < array.length ; i++) {


            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}
