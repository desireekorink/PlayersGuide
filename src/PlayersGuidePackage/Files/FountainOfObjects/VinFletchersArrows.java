package PlayersGuidePackage.Files.FountainOfObjects;

import java.util.Scanner;

import static PlayersGuidePackage.Files.FountainOfObjects.ArrowInformation.*;

public class VinFletchersArrows {
    static String[] arrowArray = new String[2];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        informationBoardFletchers();
        while (true) {
            System.out.println("Hello there, Programmer. Do you want to buy an arrow? yes or no?");
            String optOut = input.nextLine().toLowerCase();

            boolean wantToBuy;

            if (optOut.equals("no")) {
                System.out.println("Okay then, Programmer. See you another time.");
                wantToBuy = true;
                System.exit(0);
            } else if (optOut.equals("yes")) {
                System.out.println("Great! Let's continue.");
                wantToBuy = true;
            } else {
                wantToBuy = false;
            }
            if (wantToBuy) {
                break;
            }
        }

        boolean validArrowhead = false;
        while (!validArrowhead) {
            System.out.println("Which kind of Arrowhead do you want? I have these: \n" +
                    "+--------------------------------------+ \n" +
                    "|                                      | \n" +
                    "|               ARROWHEADS             | \n" +
                    "|             steel :  10 gold         | \n" +
                    "|              wood :   3 gold         | \n" +
                    "|          obsidian :   5 gold         | \n" +
                    "|                                      | \n" +
                    "+--------------------------------------+ \n");
            String chooseArrowhead = input.nextLine();

            if (chooseArrowhead.equals("steel")) {
                System.out.println("The " + STEEL.getCost() + " gold will be added at the end.");
                arrowArray[0] = chooseArrowhead;
                validArrowhead = true;
            } else if (chooseArrowhead.equals("wood")) {
                System.out.println("The " + WOOD.getCost() + " gold will be added at the end.");
                arrowArray[0] = chooseArrowhead;
                validArrowhead = true;
            } else if (chooseArrowhead.equals("obsidian")) {
                System.out.println("The " + OBSIDIAN.getCost() + " gold will be added at the end.");
                arrowArray[0] = chooseArrowhead;
                validArrowhead = true;
            } else {
                System.out.println("I do not have that kind of arrowhead");

            }
        }
        boolean validFletching = false;
        while (!validFletching) {
            System.out.println("Which kind of Fletching do you want? I have these: \n" +
                    "+--------------------------------------+ \n" +
                    "|                                      | \n" +
                    "|               FLETCHING`             | \n" +
                    "|           plastic :  10 gold         | \n" +
                    "|             goose :   3 gold         | \n" +
                    "|            turkey :   5 gold         | \n" +
                    "|                                      | \n" +
                    "+--------------------------------------+ \n");
            String chooseFletching = input.nextLine();

            if (chooseFletching.equals("plastic")) {
                System.out.println("The " + PLASTIC.getCost() + " gold will be added at the end.");
                arrowArray[1] = chooseFletching;
                validFletching = true;
            } else if (chooseFletching.equals("goose")) {
                System.out.println("That's " + GOOSE.getCost() + " gold will be added at the end.");
                arrowArray[1] = chooseFletching;
                validFletching = true;
            } else if (chooseFletching.equals("turkey")) {
                System.out.println("The " + TURKEY.getCost() + " gold will be added at the end.");
                arrowArray[1] = chooseFletching;
                validFletching = true;
            } else {
                System.out.println("I do not have that kind of fletching");

            }
        }
        System.out.println("Last but not least: the Shaft. \n" +
                "+--------------------------------------+ \n" +
                "|                                      | \n" +
                "|                SHAFTS                | \n" +
                "|      60 to 100 cm : 0.05 gold        | \n" +
                "|                     per centimeter   | \n" +
                "|                                      | \n" +
                "+--------------------------------------+  \n" +
                "Choose a shaft length to your liking.");
        boolean isValidLength = false;
        int chooseShaftLength;
        double roundedValue = 0;
        while (!isValidLength) {
            chooseShaftLength = input.nextInt();
            if (chooseShaftLength >= 60 && chooseShaftLength <= 100) {
                double shaftLength;
                for (shaftLength = 60; shaftLength < chooseShaftLength; shaftLength += 0.05) {

                }
                roundedValue = Math.round(shaftLength * 100) / 100.0;
                System.out.println("That will cost " + roundedValue + " gold. It will be added at the end.");
                isValidLength = true;
            } else if (chooseShaftLength < 60) {
                System.out.println("I will not make a shaft that small. Choose something I will make.");
            } else if (chooseShaftLength > 100) {
                System.out.println("I will not make a shaft that big. Choose something I can make.");
            }
        }
        System.out.println("How many arrows do you want?");
        totalCostAmountOfArrows(input, roundedValue);
    }

    private static void totalCostAmountOfArrows(Scanner input, double roundedValue) {
        //Parse String to Int Array
        double[] multipleArrows = new double[arrowArray.length];

        for (int i = 0; i < arrowArray.length; i++) {
            multipleArrows[i] = Integer.parseInt(arrowArray[i]);
        }


        int numArrows = input.nextInt();
        input.nextInt();
        double resultOne = numArrows * multipleArrows[0];
        double resultTwo = numArrows * multipleArrows[1];
        double resultThree = numArrows * roundedValue;
        System.out.println("That will be" + resultOne + resultTwo + resultThree);

    }


    private static void informationBoardFletchers() {
        System.out.println(
                "+--------------------------------------+ \n" +
                        "|         Welcome to Fletcher's        | \n" +
                        "+--------------------------------------+ \n" +
                        "+                                      + \n" +
                        "|               ARROWHEADS             | \n" +
                        "|             steel :  10 gold         | \n" +
                        "|              wood :   3 gold         | \n" +
                        "|          obsidian :   5 gold         | \n" +
                        "|                                      | \n" +
                        "+--------------------------------------+ \n" +
                        "|                                      | \n" +
                        "|              FLETCHING               | \n" +
                        "|           plastic : 10 gold          | \n" +
                        "|             goose :  3 gold          | \n" +
                        "|            turkey :  5 gold          | \n" +
                        "|                                      | \n" +
                        "+--------------------------------------+ \n" +
                        "|                                      | \n" +
                        "|                SHAFTS                | \n" +
                        "|      60 to 100 cm : 0.05 gold        | \n" +
                        "|                     per centimeter   | \n" +
                        "|                                      | \n" +
                        "+--------------------------------------+ ");
    }
}
/*
Vin Fletcher is a skilled arrow maker.
He asks for your help building a new class to represent arrows and determine how much he should sell them for.
“A tiny fragment of my soul goes into each arrow; I care not for the money;
I just need to be able to recoup my costs and get food on the table,” he says.
Each arrow has three parts:
- the arrowhead (steel, wood, or obsidian),
- the shaft (a length between 60 and 100 cm long),
- and the fletching (plastic, turkey feathers, or goose feathers).

His costs are as follows:
For arrowheads,
- steel costs 10 gold,
- wood costs 3 gold,
- and obsidian costs 5 gold.

For fletching,
- plastic costs 10 gold,
- turkey feathers cost 5 gold, and
- goose feathers cost 3 gold.

For the shaft, the price depends on the length: 0.05 gold per centimeter.

Objectives:

- Define a new Arrow class with fields for arrowhead type, fletching type, and length.
 (Hint: arrowhead types and fletching types might be good enumerations.)
- Allow a user to pick the arrowhead, fletching type, and length and then create a new Arrow instance.
- Add a getCost method that returns its cost as a float based on the numbers above, and use this to display the arrow’s cost.
 */