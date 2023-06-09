import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String steps = scanner.nextLine();


        int stepsCount = 0;

        while (!steps.equals("Going home")){

            int currentSteps = Integer.parseInt(steps);
            stepsCount += currentSteps;


            if (stepsCount > 10000){
                System.out.println("Goal reached! Good job!");
                System.out.println( "steps over the goal!");
                break;
            }
            steps = scanner.nextLine();
        }
        if (steps.equals("Going home")){
            int lastSteps = Integer.parseInt(steps);
            stepsCount += lastSteps;
            System.out.println( "more steps to reach goal.");
        }



    }
}
