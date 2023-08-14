public class ArraysEx17 {
    public static void main(String[] args) {

        int [] numbers = {1,25,1,-55,958,68423,};

        int smallNum = numbers[0];
        int bigNum = numbers[0];

//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > smallNum){
//                smallNum = numbers[i];
//            }else if (numbers[i] < bigNum){
//                bigNum = numbers[i];
//            }
//
//        }

        for (int element: numbers) {
            if (element < smallNum){
                smallNum = element;
            }if (element> bigNum){
                bigNum = element;
            }

        }
        System.out.println(smallNum);
        System.out.println(bigNum);
    }
}
