package PlayersGuidePackage.Files;

import java.awt.*;
import java.util.Scanner;

public class TheDefenseOfConsolas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean attackIsOver = false;
        System.out.println("The Manticore is attacking!");
        do {
            System.out.println("Which column do you want to deploy the shield?");
            int column = input.nextInt();
            Toolkit.getDefaultToolkit().beep();
            System.out.println("Which row do you want to deploy the shield?");
            int row = input.nextInt();
            Toolkit.getDefaultToolkit().beep();
            System.out.println("Deployed the shield on: (" + column + ", " + row + ")");
            System.out.println("Is the Manticore still there? [y]es or [n]o?");
            String over = input.next();
            if (over.equals("n")) {
                attackIsOver = true;
                System.out.println("The Manticore is leaving! You successfully defended Consolas!");
            } else if (over.equals("y"))
                attackIsOver = false;
        } while (!attackIsOver);
    }
}
