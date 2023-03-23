package PlayersGuidePackage.Files;

public class TheMagicCannon {

    static int crankFire = 3;
    static int countCrankFire = 0;
    static int crankElectric = 5;
    static int countCrankElectric = 0;

    public enum blastType {
        Electric("\u001B[34m"),
        Fire("\u001B[31m"),
        Normal("\u001B[37m"),
        Powerful("\u001B[35m");
        private String color;

        blastType(String color) {
            this.color=color;
        }
        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        for (int crank = 1; crank <= 100; crank++) {
            String output = crank + ". ";
            blastType blast = blastType.Normal;
            if (crank % crankFire == 0) {
                if(crank % crankElectric == 0) {
                    blast = blastType.Powerful;
                    countCrankElectric++;
                }
                else {
                    blast = blastType.Fire;
                    countCrankFire++;
                }
            }
            else if (crank % crankElectric == 0) {
                blast = blastType.Electric;
                countCrankElectric++;
            }

            output += blast;
            System.out.println(blast.getColor() + output);
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

