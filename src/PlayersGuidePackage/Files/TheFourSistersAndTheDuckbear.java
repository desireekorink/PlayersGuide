package PlayersGuidePackage.Files;

import java.util.Scanner;

public class TheFourSistersAndTheDuckbear {
    public static void main(String[] args) {
        System.out.println("How many chocolate eggs do you have?");
        Scanner input = new Scanner(System.in);
        int numberOfEggs = input.nextInt();

        int eggsPerSister = numberOfEggs / 4;
        int eggsDuckbear = numberOfEggs % 4;
        System.out.println("The number of Chocolate Eggs per Sister: " + eggsPerSister);
        System.out.println("The number of Chocolate Eggs for the Duckbear: " + eggsDuckbear);

    }
}
