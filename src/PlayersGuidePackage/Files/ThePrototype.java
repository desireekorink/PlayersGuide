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
