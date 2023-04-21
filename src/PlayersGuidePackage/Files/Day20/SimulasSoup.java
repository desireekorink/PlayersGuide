package PlayersGuidePackage.Files.Day20;

import java.util.Scanner;

import static PlayersGuidePackage.Files.Day20.Ingredients.*;

public class SimulasSoup {
    static String[] recipeArray = new String[3];

    public static void main(String[] args) {

        String soup = SOUP.name().toLowerCase();
        String stew = STEW.name().toLowerCase();
        String gumbo = GUMBO.name().toLowerCase();
        String mushrooms = MUSHROOMS.name().toLowerCase();
        String chicken = CHICKEN.name().toLowerCase();
        String carrots = CARROTS.name().toLowerCase();
        String potatoes = POTATOES.name().toLowerCase();
        String spicy = SPICY.name().toLowerCase();
        String salty = SALTY.name().toLowerCase();
        String sweet = SWEET.name().toLowerCase();


        Scanner input = new Scanner(System.in);

        System.out.println("Let's get Cooking, \nWhat do you want to eat? " + soup + ", " + stew + " or " + gumbo + "?");
        String chooseFirstIngredient = input.next().toLowerCase();
        input.nextLine();
        if (chooseFirstIngredient.equals("soup")) {
            solutionFirstChoice(chooseFirstIngredient);
        } else if (chooseFirstIngredient.equals("stew")) {
            solutionFirstChoice(chooseFirstIngredient);
        } else if (chooseFirstIngredient.equals("gumbo")) {
            solutionFirstChoice(chooseFirstIngredient);
        } else if (chooseFirstIngredient.equals("all")) {
            System.out.println("I do not have that many pans. I can only make one.");
        } else {
            System.out.println("That's not an option. " +
                    "What do you want to eat?" + soup + ", " + stew + " or " + gumbo + "?");
        }

        System.out.println("\nNow that we know what we are going to eat, what will be the main ingredient? I have " + mushrooms + ", " + chicken + ", " + carrots + " or " + potatoes + "?");
        String chooseSecondIngredient = input.nextLine().toLowerCase();
        if (chooseSecondIngredient.equals("mushrooms")) {
            solutionSecondChoice(chooseSecondIngredient);
        } else if (chooseSecondIngredient.equals("chicken")) {
            solutionSecondChoice(chooseSecondIngredient);
        } else if (chooseSecondIngredient.equals("carrot")) {
            solutionSecondChoice(chooseSecondIngredient);
        } else if (chooseSecondIngredient.equals("all")) {
            System.out.println("The pan I have is to small for every ingredient. You must choose one.");
        } else {
            System.out.println("I do not have that ingredient. I do have " + mushrooms + ", " + chicken + ", " + carrots + "or " + potatoes + "?");
        }

        System.out.println("Now that we have the recipe and ingredients, " +
                "what seasoning do want? I can make it " + spicy + "," + salty + " or " + sweet + ".");
        String chooseThirdIngredient = input.nextLine().toLowerCase();
        if (chooseThirdIngredient.equals("spicy")) {
            solutionThirdChoice(chooseThirdIngredient);
        } else if (chooseThirdIngredient.equals("salty")) {
            solutionThirdChoice(chooseThirdIngredient);
        } else if (chooseThirdIngredient.equals("sweet")) {
            solutionThirdChoice(chooseThirdIngredient);
        } else if (chooseThirdIngredient.equals("all")) {
            System.out.println("Gross! If I trow in al the seasonings, it will ruin the " + recipeArray[1] + "!" +
                    "\nPlease choose " + spicy + "," + salty + " or " + sweet + ".");
        } else {
            System.out.println("That seasoning is too expensive to have in these times. " +
                    "\nPlease choose " + spicy + "," + salty + " or " + sweet + ".");
        }
        System.out.println("Now that we have chosen everything, let's throw it together!" +
                "\nCooking takes some time, so if you could hang on a second...");
        try {
            cookingTakesTime();
            cookingTakesTime();
            cookingTakesTime();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thanks for waiting. I'm now ready to serve you: The " + recipeArray[0] + " " + recipeArray[1] + " " + recipeArray[2] + "!");

    }


    private static void cookingTakesTime() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(". . .");
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
