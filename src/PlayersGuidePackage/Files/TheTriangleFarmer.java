package PlayersGuidePackage.Files;

import java.util.Scanner;

public class TheTriangleFarmer {

    public static void main(String[] args) {
        System.out.println("What is the base size of your Triangle?");
        Scanner input = new Scanner(System.in);
        int base = Integer.parseInt(input.next());
        System.out.println("What is the height size  of your Triangle?");
        int height = Integer.parseInt(input.next());
        System.out.println("The Area of your Triangle = " + base +" x " + height + " / 2 = " + (base*height)/2);
    }
}

