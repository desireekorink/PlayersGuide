package PlayersGuidePackage.Files.FountainOfObjects;

import java.util.Scanner;

import static PlayersGuidePackage.Files.FountainOfObjects.ArrowInformation.*;

public class VinFletchersArrows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printInformationBoardFletchers();
        startFletchersArrows(input);
        printPremadeArrows(input);

        System.out.println("Thank you for your purchase. See you again soon, Programmer!");
        System.exit(0);
    }

    private static void startFletchersArrows(Scanner input) {
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
    }

    private static void printPremadeArrows(Scanner input) {
        while (true) {
            System.out.println(" +--------------------------------------+ \n" +
                    " |                                      | \n" +
                    " |             PREMADE ARROWS           | \n" +
                    " |       ##########################     | \n" +
                    " |      ELITE : 24 gold & 75 silver     | \n" +
                    " |              steel, plastic & 95 cm  | \n" +
                    " |   BEGINNER :  9 gold & 75 silver     | \n" +
                    " |              wood, goose  & 75 cm    | \n" +
                    " |   MARKSMAN : 24 gold & 75 silver     | \n" +
                    " |              steel, goose & 65 cm    | \n" +
                    " |                                      | \n" +
                    " +--------------------------------------+  \n" +
                    "\nDo you want to have a premade arrow? yes or no?");
            String optOut = input.nextLine().toLowerCase();
            boolean wantToBuy;

            if (optOut.equals("no")) {
                System.out.println("Okay, let's continue");
                printArrowhead(input);
                printFletching(input);
                double roundedValue = printShaft(input);
                System.out.println("How many arrows do you want?");
                printTotalCostAmountOfArrows(input, roundedValue);
                break;

            } else if (optOut.equals("yes")) {
                System.out.println("Great, which one?");
                String whichOne = input.nextLine().toLowerCase();
                if (whichOne.equals("elite")) {
                    createEliteArrow();
                    wantToBuy = true;

                } else if (whichOne.equals("beginner")) {
                    createBeginnersArrow();
                    wantToBuy = true;

                } else if (whichOne.equals("marksman")) {
                    createMarksmanArrow();
                    wantToBuy = true;

                } else {
                    wantToBuy = false;
                }
                if (wantToBuy) {
                    break;
                }
            }
        }
    }

    private static double createEliteArrow() {
        Scanner input = new Scanner(System.in);

        arrowArray[0] = STEEL.getCost();
        arrowArray[1] = PLASTIC.getCost();
        double roundedValue = 0;
        for (double shaftLength = 95; shaftLength == 95; shaftLength += 0.05) {

            roundedValue = Math.round(shaftLength * 100) / 100.0;
        }
        double eliteArrow = roundedValue + arrowArray[0] + arrowArray[1];

        System.out.println(roundedValue + " for the shaft.");
        System.out.println(arrowArray[0] + " for the arrowhead.");
        System.out.println(arrowArray[1] + " for the fletching.");
        System.out.println("That will cost " + eliteArrow + " gold.");

        System.out.println("How many arrows do you want?");

        printTotalCostAmountOfArrows(input, roundedValue);

        return eliteArrow;
    }

    private static double createBeginnersArrow() {
        Scanner input = new Scanner(System.in);

        arrowArray[0] = STEEL.getCost();
        arrowArray[1] = GOOSE.getCost();
        double roundedValue = 0;
        for (double shaftLength = 75; shaftLength == 75; shaftLength += 0.05) {

            roundedValue = Math.round(shaftLength * 100) / 100.0;
        }
        double beginnersArrow = roundedValue + arrowArray[0] + arrowArray[1];

        System.out.println(roundedValue + " for the shaft.");
        System.out.println(arrowArray[0] + " for the arrowhead.");
        System.out.println(arrowArray[1] + " for the fletching.");
        System.out.println("That will cost " + beginnersArrow + " gold.");

        System.out.println("How many arrows do you want?");
        printTotalCostAmountOfArrows(input, roundedValue);

        return beginnersArrow;
    }

    private static double createMarksmanArrow() {
        Scanner input = new Scanner(System.in);

        arrowArray[0] = STEEL.getCost();
        arrowArray[1] = GOOSE.getCost();
        double roundedValue = 0;
        for (double shaftLength = 65; shaftLength == 65; shaftLength += 0.05) {

            roundedValue = Math.round(shaftLength * 100) / 100.0;
        }
        double marksmanArrow = roundedValue + arrowArray[0] + arrowArray[1];

        System.out.println(roundedValue + " for the shaft.");
        System.out.println(arrowArray[0] + " for the arrowhead.");
        System.out.println(arrowArray[1] + " for the fletching.");
        System.out.println("That will cost " + marksmanArrow + " gold.");

        System.out.println("How many arrows do you want?");
        printTotalCostAmountOfArrows(input, roundedValue);


        return marksmanArrow;
    }


    private static double printShaft(Scanner input) {
        System.out.println("Last but not least: the Shaft. \n" +
                " +--------------------------------------+ \n" +
                " |                                      | \n" +
                " |                SHAFTS                | \n" +
                " |      60 to 100 cm : 0.05 gold        | \n" +
                " |                     per centimeter   | \n" +
                " |                                      | \n" +
                " +--------------------------------------+  \n" +
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
        return roundedValue;
    }

    static double[] arrowArray = new double[3];

    private static void printArrowhead(Scanner input) {
        boolean validArrowhead = false;
        while (!validArrowhead) {
            System.out.println("Which kind of Arrowhead do you want? I have these: \n" +
                    " +--------------------------------------+ \n" +
                    " |                                      | \n" +
                    " |               ARROWHEADS             | \n" +
                    " |             steel :  10 gold         | \n" +
                    " |              wood :   3 gold         | \n" +
                    " |          obsidian :   5 gold         | \n" +
                    " |                                      | \n" +
                    " +--------------------------------------+ \n");
            String chooseArrowhead = input.nextLine();

            if (chooseArrowhead.equals("steel")) {
                System.out.println("The " + STEEL.getCost() + " gold will be added at the end.");
                arrowArray[0] = STEEL.getCost();
                validArrowhead = true;
            } else if (chooseArrowhead.equals("wood")) {
                System.out.println("The " + WOOD.getCost() + " gold will be added at the end.");
                arrowArray[0] = WOOD.getCost();
                validArrowhead = true;
            } else if (chooseArrowhead.equals("obsidian")) {
                System.out.println("The " + OBSIDIAN.getCost() + " gold will be added at the end.");
                arrowArray[0] = OBSIDIAN.getCost();
                validArrowhead = true;
            } else {
                System.out.println("I do not have that kind of arrowhead");

            }
        }
    }

    private static void printFletching(Scanner input) {
        boolean validFletching = false;
        while (!validFletching) {
            System.out.println("Which kind of Fletching do you want? I have these: \n" +
                    " +--------------------------------------+ \n" +
                    " |                                      | \n" +
                    " |               FLETCHING`             | \n" +
                    " |           plastic :  10 gold         | \n" +
                    " |             goose :   3 gold         | \n" +
                    " |            turkey :   5 gold         | \n" +
                    " |                                      | \n" +
                    " +--------------------------------------+ \n");
            String chooseFletching = input.nextLine();

            if (chooseFletching.equals("plastic")) {
                System.out.println("The " + PLASTIC.getCost() + " gold will be added at the end.");
                arrowArray[1] = PLASTIC.getCost();
                validFletching = true;
            } else if (chooseFletching.equals("goose")) {
                System.out.println("That's " + GOOSE.getCost() + " gold will be added at the end.");
                arrowArray[1] = GOOSE.getCost();
                validFletching = true;
            } else if (chooseFletching.equals("turkey")) {
                System.out.println("The " + TURKEY.getCost() + " gold will be added at the end.");
                arrowArray[1] = TURKEY.getCost();
                validFletching = true;
            } else {
                System.out.println("I do not have that kind of fletching");

            }
        }
    }

    private static void printTotalCostAmountOfArrows(Scanner input, double roundedValue) {

        double numArrows = input.nextDouble();

        double resultOne = (numArrows * arrowArray[0]);
        System.out.println(resultOne + " for the arrowhead.");
        double resultTwo = (numArrows * arrowArray[1]);
        System.out.println(resultTwo + " for the fletching.");
        double resultThree = (numArrows * roundedValue);
        System.out.println(resultThree + " for the shaft.");
        System.out.println("--------------");

        System.out.println("That will be " + (resultOne + resultTwo + resultThree) + " gold total.");
    }


    private static void printInformationBoardFletchers() {
        System.out.println(
                " +--------------------------------------+ \n" +
                        " |         Welcome to Fletcher's        | \n" +
                        " +--------------------------------------+ \n" +
                        " +                                      + \n" +
                        " |               ARROWHEADS             | \n" +
                        " |             steel :  10 gold         | \n" +
                        " |              wood :   3 gold         | \n" +
                        " |          obsidian :   5 gold         | \n" +
                        " |                                      | \n" +
                        " +--------------------------------------+ \n" +
                        " |                                      | \n" +
                        " |              FLETCHING               | \n" +
                        " |           plastic : 10 gold          | \n" +
                        " |             goose :  3 gold          | \n" +
                        " |            turkey :  5 gold          | \n" +
                        " |                                      | \n" +
                        " +--------------------------------------+ \n" +
                        " |                                      | \n" +
                        " |                SHAFTS                | \n" +
                        " |      60 to 100 cm : 0.05 gold        | \n" +
                        " |                     per centimeter   | \n" +
                        " |                                      | \n" +
                        " +--------------------------------------+ ");
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