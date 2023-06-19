package PlayersGuidePackage.Files.LockedDoor;

import java.util.Scanner;

public class LockedDoor {

    private static class doorStateResult {
        private final int passcode;
        private final DoorState doorState;

        private doorStateResult(int passcode, DoorState doorState) {
            this.passcode = passcode;
            this.doorState = doorState;
        }

        private int getPasscode() {
            return passcode;
        }

        private DoorState getDoorState() {
            return doorState;
        }

    }

    public static void main(String[] args) {
        Scanner action = new Scanner(System.in);
        DoorState doorState = DoorState.LOCKED;
        int passcode = 1234;

        while (!action.equals("exit")) {
            System.out.println("The door is " + doorState + ". What do you want to do?");
            String userInput = action.nextLine();
            doorStateResult unlockResult = unlockDoor(userInput, action, passcode, doorState);
            passcode = unlockResult.getPasscode();
            doorState = unlockResult.getDoorState();
            doorState = openDoor(doorState, userInput);
            doorState = closeDoor(doorState, userInput);
            doorState = lockDoor(doorState, userInput);
        }

    }

    private static DoorState closeDoor(DoorState doorState, String userInput) {
        if (userInput.equals("close") && doorState == DoorState.OPEN) {
            doorState = DoorState.CLOSED;
        }
        return doorState;
    }

    private static DoorState lockDoor(DoorState doorState, String userInput) {
        if (userInput.equals("lock") && doorState == DoorState.CLOSED) {
            doorState = DoorState.LOCKED;
        }
        return doorState;
    }

    private static DoorState openDoor(DoorState doorState, String userInput) {
        if (userInput.equals("open") && doorState == DoorState.CLOSED) {
            doorState = DoorState.OPEN;
        }
        return doorState;
    }

    private static doorStateResult unlockDoor(String userInput, Scanner action, int passcode, DoorState doorState) {
        if (userInput.equals("unlock") && doorState == DoorState.LOCKED) {
            System.out.println("You need a passcode to unlock the door! \n" +
                    "Type in the password:");
            while (action.nextInt() != passcode) {
                System.out.println("Wrong! Try again.");
            }
            action.nextLine(); // Consume the remaining newline character

            System.out.println("Passcode correct! \n" +
                    "The door is now unlocked. \n");
            doorState = DoorState.CLOSED;
            System.out.print("Do you want to renew the passcode? ");
            String response = action.next();

            if (response.equals("yes")) {
                System.out.println("What will be the new code?");
                passcode = action.nextInt();
                System.out.println("Passcode changed to " + passcode);
            } else if (response.equals("no")) {
                System.out.println("It will remain the current passcode.");
            }
        }
        return new doorStateResult(passcode, doorState);
    }
}


