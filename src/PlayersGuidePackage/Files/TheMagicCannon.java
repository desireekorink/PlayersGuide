package PlayersGuidePackage.Files;

public class TheMagicCannon {
    static int crankNormal = 1;
    static int countCrankNormal = 0;
    static int crankFire = 3;
    static int countCrankFire = 0;
    static int crankElectric = 5;
    static int countCrankElectric = 0;


    public static void main(String[] args) {
        for (int crank = 1; crank <= 100; crank++) {
            String output = crank + ". ";
            if (crank % crankNormal == 0) {
                output += "Normal";
                countCrankNormal++;
                if (crank % crankFire == 0) {
                    output += "Fire";
                    countCrankFire++;
                    if (crank % crankElectric == 0) {
                        output += "Electric";
                        countCrankElectric++;
                        System.out.println(output);
                    } else if (output == "NormalFire") {
                        System.out.println("Fire");
                    }
                } else {
                    System.out.println(output);
                }
            }
        }
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

