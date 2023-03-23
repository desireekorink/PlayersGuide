package PlayersGuidePackage.Files;

import java.util.Scanner;

public class ChallengeWatchtower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the enemy (+) East or (-) West?");
        int xValue = input.nextInt();
        System.out.println("Is the enemy (+) North or (-) South?");
        int yValue = input.nextInt();

        if (xValue > 0 && yValue > 0){
            System.out.println("The enemy is northeast!");
        } else if (xValue > 0 && yValue < 0) {
            System.out.println("The enemy is southeast!");
        } else if (xValue < 0 && yValue > 0){
            System.out.println("The enemy is northwest!");
        } else if (xValue < 0 && yValue < 0) {
            System.out.println("The enemy is southwest!");

        }

    }
}
