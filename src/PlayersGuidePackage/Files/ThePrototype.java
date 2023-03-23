package PlayersGuidePackage.Files;

import java.util.Random;
import java.util.Scanner;

public class ThePrototype {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int pilot = random.nextInt((max - min) + 1) + min;
        System.out.println("We are hunting down the Uncoded One's ship. You, the Hunter will shoot it down. \n" +
                "The Pilot knows if how far the ship is and will guide you into making a devastating blow!");
        Scanner input = new Scanner(System.in);
        int hunter;
        do {
            hunter = input.nextInt();

            if (hunter == pilot) {
                System.out.println("You hit the ship! The Uncoded One will need to recover from this blow.");
            } else if (hunter < pilot) {
                System.out.println("The shots are to close! Try again.");
            } else if (hunter > pilot) {
                System.out.println("The shots are to far! Try again.");
            } else if (hunter < 1 || hunter > 100) {
                System.out.println("You need to stay within the perimeter!");
            }
        } while (hunter != pilot);
    }
}
        /*
        Build a program that will allow a user, the pilot, to enter a number.
        If the number is above 100 or less than 0, keep asking.
        Clear the screen once the program has collected a good number.
        Ask a second user, the hunter,to guess numbers.
        Indicate whether the user guessed too high, too low, or guessed right.
        Loop until they get it right, then end the program.
         */

