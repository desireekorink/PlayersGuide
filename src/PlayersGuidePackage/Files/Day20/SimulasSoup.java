package PlayersGuidePackage.Files.Day20;

import java.util.Scanner;

import static PlayersGuidePackage.Files.Day20.Ingredients.*;

public class SimulasSoup {
    static String[] recipeArray = new String[3];

    public static void main(String[] args) {

        String soup = SOUP.name().toLowerCase();
        String stew = STEW.name().toLowerCase();
        String gumbo = GUMBO.name().toLowerCase();
        String mushroom = MUSHROOM.name().toLowerCase();
        String chicken = CHICKEN.name().toLowerCase();
        String carrot = CARROT.name().toLowerCase();
        String potato = POTATO.name().toLowerCase();
        String spicy = SPICY.name().toLowerCase();
        String salty = SALTY.name().toLowerCase();
        String sweet = SWEET.name().toLowerCase();


        Scanner input = new Scanner(System.in);
        System.out.println("Let's get Cooking ");

        while (true) {
            System.out.println("What do you want to eat? " + soup + ", " + stew + " or " + gumbo + "?");
            String chooseFirstIngredient = input.next().toLowerCase();
            boolean isValidInput = false;

            if (chooseFirstIngredient.equals("soup")) {
                solutionFirstChoice(chooseFirstIngredient);
                isValidInput = true;
            } else if (chooseFirstIngredient.equals("stew")) {
                solutionFirstChoice(chooseFirstIngredient);
                isValidInput = true;
            } else if (chooseFirstIngredient.equals("gumbo")) {
                solutionFirstChoice(chooseFirstIngredient);
                isValidInput = true;
            } else if (chooseFirstIngredient.equals("all")) {
                System.out.println("I do not have that many pans. I can only make one. \n");
            } else {
                System.out.println("That's not an option. \n ");
            }
            if (isValidInput) {
                break;
            }
        }
        System.out.println("\nNow that we know what we are going to eat, what will be the main ingredient?");

        while (true) {
            System.out.println("I have " + mushroom + ", " + chicken + ", " + carrot + " or " + potato + "? ");
            String chooseSecondIngredient = input.next().toLowerCase();
            boolean isValidInput = false;

            if (chooseSecondIngredient.equals("mushroom")) {
                solutionSecondChoice(chooseSecondIngredient);
                isValidInput = true;
            } else if (chooseSecondIngredient.equals("chicken")) {
                solutionSecondChoice(chooseSecondIngredient);
                isValidInput = true;
            } else if (chooseSecondIngredient.equals("carrot")) {
                solutionSecondChoice(chooseSecondIngredient);
                isValidInput = true;
            } else if (chooseSecondIngredient.equals("potato")) {
                solutionSecondChoice(chooseSecondIngredient);
                isValidInput = true;
            } else if (chooseSecondIngredient.equals("all")) {
                System.out.println("The pan I have is to small for every ingredient. You must choose one. \n");
            } else {
                System.out.println("I do not have that ingredient. \n");
            }
            if (isValidInput) {
                break;
            }
        }

        System.out.println("\nNow that we have the recipe and ingredients, ");
        while (true) {
            System.out.println("What seasoning do you want? I can make it " + spicy + ", " + salty + " or " + sweet + ".");
            String chooseThirdIngredient = input.next().toLowerCase();
            boolean isValidInput = false;

            if (chooseThirdIngredient.equals("spicy")) {
                solutionThirdChoice(chooseThirdIngredient);
                isValidInput = true;
            } else if (chooseThirdIngredient.equals("salty")) {
                solutionThirdChoice(chooseThirdIngredient);
                isValidInput = true;
            } else if (chooseThirdIngredient.equals("sweet")) {
                solutionThirdChoice(chooseThirdIngredient);
                isValidInput = true;
            } else if (chooseThirdIngredient.equals("all")) {
                System.out.println("Gross! If I trow in al the seasonings, it will ruin the " + recipeArray[2] + "!");
            } else {
                System.out.println("That seasoning is too expensive to have in these times. ");
            }
            if (isValidInput) {
                break;
            }
        }

        System.out.println("\nNow that we have chosen everything, let's throw it together!" +
                "\nCooking takes some time, so if you could hang on a second...");
        try {
            cookingTakesTime();
            cookingTakesTime();
            cookingTakesTime();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nThanks for waiting. I'm now ready to serve you: The " + recipeArray[0] + " " + recipeArray[1] + " " + recipeArray[2] + "!");

    }


    private static void cookingTakesTime() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print(". ");
    }

    private static void solutionThirdChoice(String chooseThirdIngredient) {
        recipeArray[0] = chooseThirdIngredient;
        System.out.println("Perfect! Let's make it " + recipeArray[0] + "!");
    }

    private static void solutionFirstChoice(String chooseFirstIngredient) {
        recipeArray[2] = chooseFirstIngredient;
        System.out.println("Let's make a delicious " + recipeArray[2] + ".");
    }

    private static void solutionSecondChoice(String chooseSecondIngredient) {
        recipeArray[1] = chooseSecondIngredient;
        System.out.println("Great! I do love a good " + recipeArray[1] + " " + recipeArray[2] + "!");
    }

}
