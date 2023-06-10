import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length* height;
        String boxSize = scanner.nextLine();

        while (!boxSize.equals("Done")){

            int boxSizeNum = Integer.parseInt(boxSize);
            freeSpace = freeSpace - boxSizeNum;

            if ( freeSpace <= 0 ) {
                System.out.printf("No more free space! You need %d Cubic meters more." ,Math.abs(freeSpace));
                break;
            }
            boxSize = scanner.nextLine();

        }

        if ( freeSpace > 0){
            System.out.printf(" %d Cubic meters left.", freeSpace);

        }






    }

}
