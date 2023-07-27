public class ArrayEx3 {
    public static void main(String[] args) {
        double [] grades = {4.5, 3.7, 5.5,4.5, 1.7, 95.5,14.5, 53.7, 75.5, -109};
        double maxGrade = grades[0];
        double minGrade = grades[0];

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] > maxGrade) {
                maxGrade = grades[i];

            }else if ( grades[i] < minGrade){
                minGrade = grades[i];
            }

        }
        System.out.println(maxGrade );
        System.out.println(minGrade );



    }
}
