package PlayersGuidePackage.Files;

public class TheMagicCannon {
    static int crankNormal = 1;
    static int crankFire = 3;
    static int crankElectric = 5;


    public static void main(String[] args) {
        do {
            for (crankNormal = 1; crankNormal <= 100; crankNormal++) {
                if (crankNormal % 5 == 0) {
                } else if (crankNormal % 3 == 0) {
                }

            }
            for (crankFire = 3; crankFire <= 100; crankFire++) {
                if (crankFire % 5 == 0) {
                    continue;
                } else if (crankFire > 100);
                break;
            }
            for (crankElectric = 4; crankElectric <= 100; crankElectric++) {
                System.out.println("Crank Electric: " + crankElectric);

            }
            System.out.println("Crank Normal: " + crankNormal);
            System.out.println("Crank Fire: " + crankFire);
            System.out.println("Crank Electric: " + crankElectric);

        }
        while (crankNormal > 100 || crankFire > 100 || crankElectric > 100);
    }

}


        /*
        A partial output of the desired program looks like this:
        1: Normal
        2: Normal
        3: Fire
        4: Normal
        5: Electric
        6: Fire
        7: Normal
        Objectives:
        Write a program that will loop through the values between 1 and 100 and display
        what kind of blast the crew should expect. (The % operator may be of use.)
        Change the color of the output based on the type of blast.
        (For example, red for Fire, yellow for Electric, and blue for Electric and Fire).
        (note: if you can't easily find a Java command to change console color in 5 to 10 minutes,
        google it or check out https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
         */

