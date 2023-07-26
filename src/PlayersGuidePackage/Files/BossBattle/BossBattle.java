package PlayersGuidePackage.Files.BossBattle;

import PlayersGuidePackage.Utils.Color;
import PlayersGuidePackage.Utils.Sounds;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BossBattle {
    static int manticoreHealth = 10;
    static int consolasHealth = 15;
    private static List<Sounds.SoundPlayer> soundPlayers;
    private static Scanner input = new Scanner(System.in);
    private int round = 1;

    public BossBattle() {
        // Game Sounds:
        soundPlayers = new ArrayList<>();
        soundPlayers.add(new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/gameLost.wav"));
        soundPlayers.add(new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/gameWon.wav"));
        soundPlayers.add(new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/hardHit.wav"));
        soundPlayers.add(new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/softHit.wav"));
    }

    public static void main(String[] args) throws UnsupportedAudioFileException {

        // Create an instance of BossBattle
        BossBattle bossBattle = new BossBattle();

        while (bossBattle.continueGame()) {
            bossBattle.damageEachRound(1, bossBattle.soundPlayers.get(3), bossBattle.soundPlayers.get(2));
        }

        Effect lostOrWon = bossBattle.winOrLose(soundPlayers.get(0), soundPlayers.get(1));
        System.out.println(lostOrWon.message);
        lostOrWon.sound.play();
    }

    public void damageEachRound(int blast, Sounds.SoundPlayer softHit, Sounds.SoundPlayer hardHit) {
        int distance = manticoreDistance.getDistance();

        for (round = 1; manticoreHealth > 0 && consolasHealth > 0; round++) {
            printInfo();
            blast = calculateBlast(round);

            int userInput = input.nextInt();

            Effect hitManticore = didUserInputHit(userInput, distance, blast, softHit, hardHit);

            System.out.println(hitManticore.message);
            hitManticore.sound.play();
        }
    }

    private int calculateBlast(int round) {
        boolean damage3 = round % 3 == 0;
        boolean damage5 = round % 5 == 0;

        if (damage3 && damage5) {
            return 10;
        } else if (damage3 || damage5) {
            return 3;
        } else {
            return 1;
        }
    }

    record Effect(String message, Sounds.SoundPlayer sound) {
    }

    private Effect didUserInputHit(int userInput, int distance, int blast, Sounds.SoundPlayer softHit, Sounds.SoundPlayer hardHit) {
        if (userInput < 0) {
            consolasHealth--;
            return new Effect("That round " + Color.MAGENTA_BOLD + "HIT OUR BASE!" + Color.RESET, softHit);
        } else if (userInput > 100) {
            consolasHealth--;
            return new Effect("That round " + Color.MAGENTA_BOLD + "HIT THE OTHER TOWN." + Color.RESET, softHit);
        } else if (userInput > distance) {
            consolasHealth--;
            return new Effect("That round" + Color.MAGENTA_BOLD + " OVERSHOT" + Color.RESET + " the target.", softHit);
        } else if (userInput < distance) {
            consolasHealth--;
            return new Effect("That round" + Color.MAGENTA_BOLD + " FELL SHORT" + Color.RESET + " of the target.", softHit);
        } else {
            manticoreHealth -= blast;
            if (blast == 10) {
                return new Effect(Color.YELLOW_BOLD + "That round was a DIRECT HIT!" + Color.RESET, hardHit);
            } else if (blast == 3) {
                return new Effect(Color.RED_BOLD + "That round was a DIRECT HIT!" + Color.RESET, hardHit);
            } else {
                return new Effect("That round was a" + Color.MAGENTA_BOLD + " DIRECT HIT!" + Color.RESET, softHit);
            }
        }
    }


    public void printInfo() {
        System.out.println("----------------------------------\n" +
                "STATUS: Round " + round + "\n" +
                "City: " + consolasHealth + "/15 | Manticore: " + manticoreHealth + "/10");
        if (continueGame()) {
            System.out.print("Enter the desired range: ");
        }

    }

    public Effect winOrLose(Sounds.SoundPlayer lost, Sounds.SoundPlayer win) {
        // creates a sound if you lose or win
        if (consolasHealth <= 0) {
            return new Effect("Consolas has been destroyed! How can we recover from this blow?", lost);
        } else
            return new Effect("The Manticore has been destroyed! The city of Consolas has been saved!", win);
    }


    public boolean continueGame() {
        return (consolasHealth > 0 && manticoreHealth > 0);
    }
}
