package PlayersGuidePackage.Files;

import java.util.Scanner;

public class TheReplicatorOfDTo {
    static int[] intArray = new int[5];

    public static void main(String[] args) {
        System.out.println("Place your first number in your array.");
        Scanner input = new Scanner(System.in);
        int askArrayNumber = input.nextInt();
        intArray[0] = askArrayNumber;

        System.out.println("Place your second number in your array.");
        askArrayNumber = input.nextInt();
        intArray[1] = askArrayNumber;

        System.out.println("Place your third number in your array.");
        askArrayNumber = input.nextInt();
        intArray[2] = askArrayNumber;

        System.out.println("Place your fourth number in your array.");
        askArrayNumber = input.nextInt();
        intArray[3] = askArrayNumber;

        System.out.println("Place your fifth number in your array.");
        askArrayNumber = input.nextInt();
        intArray[4] = askArrayNumber;
        for (int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);
    }


}
/*
While searching an abandoned storage building containing strange code artifacts, you uncover the ancient Replicator of D’To.
This can replicate the contents of any int array into another array.
But it appears broken and needs a Programmer to reforge the magic that allows it to replicate once again.

Objectives:Make a program that creates an array of length 5.
Ask the user for five numbers and put them in the array.
Make a second array of length 5.Use a loop to copy the values out of the original array and into the new one.
Display the contents of both arrays one at a time to illustrate that theReplicator of D’To works again.
 */
