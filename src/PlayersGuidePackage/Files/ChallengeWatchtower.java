package PlayersGuidePackage.Files;

import java.util.Scanner;

public class ChallengeWatchtower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the enemy (+) East or (-) West?");
        int xValue = input.nextInt();
        System.out.println("Is the enemy (+) North or (-) South?");
        int yValue = input.nextInt();
/*
        if (xValue > 0 && yValue > 0){
            System.out.println("The enemy is northeast!");
        } else if (xValue > 0 && yValue < 0) {
            System.out.println("The enemy is southeast!");
        } else if (xValue < 0 && yValue > 0){
            System.out.println("The enemy is northwest!");
        } else if (xValue < 0 && yValue < 0) {
            System.out.println("The enemy is southwest!");
        } else if (xValue == 0 && yValue > 0) {
            System.out.println("The enemy is north of us!");
        } else if (xValue > 0 && yValue == 0) {
            System.out.println("The enemy is east of us!");
        } else if (xValue == 0 && yValue < 0){
            System.out.println("The enemy is south of us!");
        } else if (xValue < 0 && yValue == 0) {
            System.out.println("The enemy is south of us!");
        } else if (xValue == 0 && yValue == 0) {
            System.out.println("The enemy is here! TOWER HAS BEEN BREACHED!");
        }
 */
        if (xValue == 0 && yValue == 0) {
            System.out.println("The enemy is here! TOWER HAS BEEN BREACHED!");
            return;
        }
        String xdirection = "";
        String ydirection = "";
        if (xValue > 0) {
            xdirection = "east";
        }
        if (xValue < 0) {
            xdirection = "west";
        }
        if (yValue > 0) {
            ydirection = "north";
        }
        if (yValue < 0){
            ydirection = "south";
        }
        System.out.println("The enemy is " + ydirection + xdirection + "!");

}}
