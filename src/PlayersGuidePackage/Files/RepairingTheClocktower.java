package PlayersGuidePackage.Files;

import java.util.Scanner;

public class RepairingTheClocktower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number?");
        int number;
        number = input.nextInt();
        if (number % 2==0 ){
            System.out.println("Tick");
        }else System.out.println("Tock");
    }
}
