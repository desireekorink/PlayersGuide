package PlayersGuidePackage.Files;


import java.util.Arrays;
import java.util.List;

public class Countdown {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        for (int number : numbersList) {
            number--;
            System.out.println(number);
        }
    }
}


/*
Hint: try read a bit about ‘recursion’
The Council of Freach has summoned you.
New writing has appeared on the Tomb of Algol the Wise, the last True Programmer to wander this land.
The writing strikes fear and awe into the hearts of the loop loving people of Freach:
“The next True Programmer shall be able to write any looping code with a method call instead.”
The Senior Counselor, scared of a world without loops,
asks you to put your skill to the test and rewrite the following code, which counts down from 10 to 1, with no loops:
for (int x = 10; x > 0; x--)
System.out.println(x);
 */
