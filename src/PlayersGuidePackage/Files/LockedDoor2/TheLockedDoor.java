package PlayersGuidePackage.Files.LockedDoor2;

import java.util.Scanner;

import static PlayersGuidePackage.Files.LockedDoor2.DoorState.*;

public class TheLockedDoor {

    private static int passcode;
    private static DoorState doorState;


    public static void main(String[] args) {
        doorState = LOCKED;
        passcode = 10;
        Scanner input = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("The door is " + doorState + ". \nWhat do you want to do?");
            doorState = fromLockedToClosed(doorState, input);
            doorState = fromClosedToOpen(input, "open", CLOSED, OPEN);
            doorState = fromOpenToClosed(input, "close", OPEN, CLOSED);
            doorState = fromClosedToLocked(input, "lock", CLOSED, LOCKED);
            changePasscode(doorState, input);

            userInput = input.nextLine().trim();
        } while (!userInput.isEmpty() && !userInput.equalsIgnoreCase("exit"));

        input.close();
        System.exit(0);
    }

    private static DoorState fromLockedToClosed(DoorState doorState, Scanner input) {
        boolean doorIsUnlocked = false;
        while (true) {
            if (doorState == LOCKED) {
                String userInput = input.nextLine();

                if (userInput.equals("unlock")) {
                    System.out.println("Press in the passcode.");
                    int userPasscode = input.nextInt();
                    if (userPasscode == passcode) {
                        System.out.println("Passcode is correct. Door is Unlocked.");
                        doorIsUnlocked = true;
                    } else {
                        System.out.println("Passcode is incorrect.");
                        doorIsUnlocked = false;
                    }

                } else {
                    System.out.println("The door is " + doorState + ". It first need to be unlocked.");
                    System.out.println("What do you want to do?");
                }
            }
            if (doorIsUnlocked) {
                doorState = CLOSED;
                break;
            }
        }
        return doorState;
    }

    private static DoorState fromClosedToOpen(Scanner input, String open, DoorState doorState, DoorState closed) {
        String userInput = input.nextLine();
        if (userInput.equals("open") && doorState == closed) {
            doorState = OPEN;
        }
        return doorState;
    }

    private static DoorState fromOpenToClosed(Scanner input, String close, DoorState doorState, DoorState open) {

        String userInput = input.nextLine();
        if (userInput.equals("close") && doorState == open) {
            doorState = CLOSED;
        }
        return doorState;
    }

    private static DoorState fromClosedToLocked(Scanner input, String lock, DoorState doorState, DoorState closed) {

        String userInput = input.nextLine();
        if (userInput.equals("lock") && doorState == closed) {
            doorState = LOCKED;
        }
        return doorState;
    }

    private static void changePasscode(DoorState doorState, Scanner input) {

        String userInput = input.nextLine();
        if (userInput.equals("change passcode") && doorState == CLOSED) {
            System.out.println("Press in old passcode: ");
            int tryOldPasscode = input.nextInt();
            if (tryOldPasscode == passcode) {
                System.out.println("Press in new passcode: ");
                input.next();
                passcode = input.nextInt();
            } else System.out.println("Incorrect passcode");
        }
    }

}
/*
Define a Door class that can keep track of whether it is locked, open, or closed.
Make it, so you can perform the four transitions defined above with methods.
Build a constructor that requires the starting numeric passcode.
Build a method that will allow you to change the passcode for an existing door by supplying the current passcode and new passcode.
- Only change the passcode if the current passcode is correct.
Make your main method ask the user for a starting passcode, then create a new Door instance.
- Allow the user to attempt the four transitions described above (open, close, lock, unlock) and change the code by typing in text commands
 */
