package PlayersGuidePackage.Files;

import java.util.Scanner;

public class TheDominionOfKings {
    public static void main(String[] args) {

        System.out.println("How many estates do you have?");
        Scanner input = new Scanner(System.in);
        int estate = input.nextInt();
        System.out.println("How many duchies do you have?");
        int duchy = input.nextInt();
        System.out.println("How many provinces do you have?");
        int province = input.nextInt();
        System.out.println("\nTotal Estate  points = " + (estate * 1) +
                "\nTotal Duchy points = "+  (duchy *3) +
                "\nTotal Province points = "+  (province * 6) +
                "\nTotal of all Points = " + ((estate * 1) + (duchy *3) + (province * 6)) );
    }
}
