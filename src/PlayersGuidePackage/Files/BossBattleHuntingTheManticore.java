package PlayersGuidePackage.Files;

import java.util.Random;
import java.util.Scanner;

public class BossBattleHuntingTheManticore {
    public static void main(String[] args) {
        int healthpointsCity = 15;
        int healthpointsManticore = 10;
        int min = 1;
        int max = 100;
        Random random = new Random();
        int placeManticore = random.nextInt((max - min) + 1) + min;

        int roundNumber = 1;
        int notPowerfulShot = 1;
        int powerfulShot3 = 3;
        int powerfulShot5 = 5;
        int powerfulShot10 = 10;

        Scanner input = new Scanner(System.in);
        //Renamed defenceCity to shotDistance
        int shotDistance;

        do {
            System.out.println("The Manticore is attacking! " +
                    "\nWe can use the Magic Cannon to take down the Manticore, otherwhise, we will not survive!");
            System.out.println(placeManticore);
            //Refactored to getRoundInformation
            getRoundInformation(healthpointsCity, healthpointsManticore, roundNumber);

            shotDistance = input.nextInt();
            //replaced unused shot by roundNumber
            for (roundNumber = 1; healthpointsCity > 0 && healthpointsManticore > 0; roundNumber++) {
                int damage = 1;
                boolean shot3 = roundNumber % powerfulShot3 == 0;
                boolean shot5 = roundNumber % powerfulShot5 == 0;
                if (shot3 && shot5) {
                    damage = powerfulShot10;
                } else if (shot5) {
                    damage = powerfulShot5;
                } else if (shot3) {
                    damage = powerfulShot3;
                } else {
                    damage = notPowerfulShot;
                }


                if (shotDistance == placeManticore) {
                    System.out.println("That round was a DIRECT HIT!");
                    healthpointsManticore = healthpointsManticore - damage;
                    healthpointsCity--;
                } else if (shotDistance < placeManticore) {
                    System.out.println("That round FELL SHORT of the target. Try again!");
                    healthpointsCity--;

                } else if (shotDistance > placeManticore) {
                    System.out.println("That round OVERSHOT the target. Try again!");
                    healthpointsCity--;

                }
                getRoundInformation(healthpointsCity, healthpointsManticore, roundNumber);
                shotDistance = input.nextInt();
            }
            if (healthpointsManticore < 1) {
                System.out.println("The Manticore had fallen! We have won!");
            } else if (healthpointsCity < 1) {
                System.out.println("The city is lost! How will we recover from this blow?");

            }
        } while (healthpointsCity > 0 && healthpointsManticore > 0);
        //moved outside the while loop
        if (healthpointsManticore <= 0) {
            System.out.println("The Manticore had fallen! We have won!");
        } else if (healthpointsCity <=0) {
            System.out.println("The city is lost! How will we recover from this blow?");

        }
    }

    private static void getRoundInformation(int healthpointsCity, int healthpointsManticore, int roundNumber) {
        System.out.println("----------------------------------\n" +
                "STATUS: Round " + roundNumber + "\n" +
                "City: " + healthpointsCity + "/15 | Manticore: " + healthpointsManticore + "/10\n" +
                "Enter desired cannon range: ");
    }

}

/* A sample run of the program is shown below. The first player gets a chance to place the Manticore:
Player 1, how far away from the city do you want to station the Manticore? 32
At this point, the display is cleared, and the second player gets their chance:
Player 2, it is your turn.
-----------------------------------------------------------
STATUS: Round: 1 City:
15/15 Manticore: 10/10 The cannon is expected to deal 1 damage this round.
Enter desired cannon range: 50 That round OVERSHOT the target.
-----------------------------------------------------------
STATUS: Round: 2 City:
14/15 Manticore: 10/10
The cannon is expected to deal 1 damage this round.
Enter desired cannon range: 25
That round FELL SHORT of the target.
-----------------------------------------------------------
STATUS: Round: 3 City:
13/15 Manticore: 10/10T
The cannon is expected to deal 3 damage this round.
Enter desired cannon range: 32
That round was a DIRECT HIT!
-----------------------------------------------------------
STATUS: Round: 4 City:
12/15 Manticore: 7/10
The cannon is expected to deal 1 damage this round.
Enter desired cannon range: 32
That round was a DIRECT HIT!
-----------------------------------------------------------
STATUS: Round: 5 City: 11/15 Manticore: 6/10
The cannon is expected to deal 3 damage this round.
Enter desired cannon range: 32
That round was a DIRECT HIT!12
 -----------------------------------------------------------
STATUS: Round: 6 City: 10/15 Manticore: 3/10
The cannon is expected to deal 3 damage this round.
Enter desired cannon range: 32
That round was a DIRECT HIT!
The Manticore has been destroyed! The city of Consolas has been saved!

Objectives:•Establish the game’s starting state: the Manticore begins with 10 healthpoints and the city with 15.
The game starts at round 1.•Ask the first player to choose the Manticore’s distance from the city (0 to100).
Clear the screen afterward.•Run the game in a loop until either the Manticore’s or city’s health reaches 0.
•Before the second player’s turn, display the round number, the city’s health, and the Manticore’s health.
•Compute how much damage the cannon will deal this round: 10 points
    if the round number is a multiple of both 3 and 5, 3 if it is a multiple of 3or 5 (but not both), and 1
    otherwise: Display this to the player.
•Get a target range from the second player, and resolve its effect.
    Tell the user if they overshot (too far), fell short, or hit the Manticore.
    If it was a hit, reduce the Manticore’s health by the expected amount.
•If the Manticore is still alive, reduce the city’s health by 1.
•Advance to the next round.
•When the Manticore or the city’s health reaches 0, end the game and display the outcome.
•Use different colors for different types of messages.
•Note: This is the largest program you have made so far. Expect it to take some time!•
Note: Use methods to focus on solving one problem at a time.
•Note: This version requires two players, but in the future, we will modify it to allow the computer to randomly
 place the Manticore so that it can be a single-player game.
 */