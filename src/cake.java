import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String width = scanner.nextLine();
        String length = scanner.nextLine();
        int peacesTaken = Integer.parseInt(scanner.nextLine());
        switch (width){
            case "stop":
                break;
        }



        int widthNum = Integer.parseInt(width);
        int lengthNum = Integer.parseInt(length);
        int allPeaces = widthNum * lengthNum;

        while (allPeaces > 0 ){
            allPeaces -= peacesTaken;

            peacesTaken = Integer.parseInt(scanner.nextLine());
        }

        if (allPeaces != 0){
            System.out.println(allPeaces);
        } else {
            System.out.println("n");


        }


    }
}
