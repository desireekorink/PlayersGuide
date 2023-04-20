package PlayersGuidePackage.Files.Day19;

import java.util.Scanner;

import static PlayersGuidePackage.Files.Day19.ChestState.*;

public class SimulasTest {
    public static void main(String[] args) {
        boolean interactWithChest = true;

        ChestState chestState = LOCKED;

        Scanner input = new Scanner(System.in);

        while (interactWithChest) {
            System.out.println("the chest is " + chestState + ". What do you want to do?");
            String choose = input.next().toLowerCase();

            if (chestState == LOCKED && choose.equals("unlock")) {
                chestState = UNLOCKED;

            } else if (chestState == UNLOCKED && choose.equals("open")) {
                chestState = OPEN;

            } else if (chestState == UNLOCKED && choose.equals("lock")) {
                chestState = LOCKED;

            } else if (chestState == OPEN && choose.equals("close")) {
                chestState = CLOSED;

            } else if (chestState == CLOSED && choose.equals("lock")) {
                chestState = LOCKED;

            } else if (chestState == CLOSED && choose.equals("open")) {
                chestState = OPEN;
                //Added to be able to break out the while loop. Can be removed if needed.
            } else if (choose.equals("leave")) {
                System.out.println("You leave the chest " + chestState + ".");
                break;
            } else {
                System.out.print("That is not possible, because ");
            }
        }
    }
}
/*
As you move through the village of Enumerant, you notice a short, cloaked figure following you.
Not being one to enjoy a mysterious figure tailing you, you seize a moment to confront the figure.
“Don’t be alarmed!” she says. “I am Simula. They are saying you’re a Programmer. Is this true?” You answer in the affirmative, and Simula’s eyes widen.
“If you are truly a Programmer, you will be able to help me. Follow me.” She leads you to a backstreet and into a dimly lit hovel. She hands you a small, locked chest.
“We haven’t seen any Programmers in these lands in a long time. And especially not ones that can craft types. If you are a True Programmer, you will want what is in that chest.
And if you are a True Programmer, I will gladly give it to you to aid you in your quest.”
The chest is a small box you can hold in your hand. The lid can be open, closed (but unlocked), or locked.
You’d normally be able to go between these states, opening, closing, locking, and unlocking the box, but the box is broken.
You need to create a program with an enumeration to recreate this locking mechanism.

The box can be in three states:
if the box is in the OPEN state, you can close it,
and it becomes CLOSED if the box is in the CLOSED state,
you can open it, and it becomes OPEN if the box is in the CLOSED state, you can lock it,
and it becomes LOCKED if the box is in the LOCKED state, you can unlock it, and it becomes CLOSED

Nothing happens if you attempt an impossible action in the current state, like opening a locked box. The program below shows what using this might look like:

The chest is locked. What do you want to do? unlock
The chest is unlocked. What do you want to do? open
The chest is open. What do you want to do? close
The chest is unlocked. What do you want to do?
Objectives:

Define an enumeration for the state of the chest.
Make a variable whose type is this new enumeration.
Write code to allow you to manipulate the chest with the lock, unlock, open, and close commands, but ensure that you don’t transition between states that don’t support it.
Loop forever, asking for the next command.
 */