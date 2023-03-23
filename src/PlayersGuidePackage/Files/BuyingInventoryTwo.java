package PlayersGuidePackage.Files;

import java.util.Scanner;

public class BuyingInventoryTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("""
                Of what item do you want the price of?\s
                1. Rope\s
                2. Torches\s
                3. Climbing Equipment\s
                4. Clean Water\s
                5. Machete\s
                6. Canoe\s
                7. Food Supplies""");
        int askInventory = input.nextInt();
        if(name.equals("Desiree")){
            switch (askInventory){
                case 1 -> System.out.println("5 gold for 1 Rope.");
                case 2 -> System.out.println("7 gold and 50 silver for 1 Torch.");
                case 3 -> System.out.println("12 gold and 50 silver for Climbing Equipment.");
                case 4 -> System.out.println("50 silver for a flask of Clean Water.");
                case 5 -> System.out.println("10 gold for 1 Machete.");
                case 6 -> System.out.println("100 gold for 1 Canoe.");
                case 7 -> System.out.println("50 silver for Food Supplies.");
                default -> System.out.println("Could not be found in the inventory.");
            }
        } else {
            switch (askInventory) {
                case 1 -> System.out.println("10 gold for 1 Rope.");
                case 2 -> System.out.println("15 gold for 1 Torch.");
                case 3 -> System.out.println("25 gold for Climbing Equipment.");
                case 4 -> System.out.println("1 gold for a flask of Clean Water.");
                case 5 -> System.out.println("20 gold for 1 Machete.");
                case 6 -> System.out.println("200 gold for 1 Canoe.");
                case 7 -> System.out.println("1 gold for Food Supplies.");
                default -> System.out.println("Could not be found in the inventory.");
            }
        }
    }
}
