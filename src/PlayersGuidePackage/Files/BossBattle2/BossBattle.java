package PlayersGuidePackage.Files.BossBattle2;

import PlayersGuidePackage.Utils.Sounds;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Scanner;

public class BossBattle {
    int manticoreHealth = 10;
    int consolasHealth = 15;


    public final Sounds.SoundPlayer softHit =
            new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/softHit.wav");
    public final Sounds.SoundPlayer hardHit =
            new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/hardHit.wav");
    public final Sounds.SoundPlayer gameWon =
            new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/gameWon.wav");
    public final Sounds.SoundPlayer gameLost =
            new Sounds.SoundPlayer("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/gameLost.wav");

    public static void main(String[] args) throws UnsupportedAudioFileException {
        // Create an instance of BossBattle
        BossBattle bossBattle = new BossBattle();
        Damage damage = new Damage(bossBattle);

        // Create an instance of the Scanner
        Scanner input = new Scanner(System.in);

        while (bossBattle.continueGame()) {
            bossBattle.printInfo(damage);
            int userInput = input.nextInt();
            damage.doRoundOfDamage(userInput);
        }
        CreateEffect.Effect lostOrWon = bossBattle.winOrLose();
        System.out.println(lostOrWon.message());
        lostOrWon.sound().play();
    }

    public void printInfo(Damage damage) {
        System.out.println("----------------------------------\n" +
                "STATUS: Round " + (damage.round) + "\n" +
                "City: " + consolasHealth + "/15 | Manticore: " + manticoreHealth + "/10");
        if (continueGame()) {
            System.out.print("Enter the desired range: ");
        }

    }

    public CreateEffect.Effect winOrLose() {
        //Chooses MessageAndSound in instance of winning and losing
        if (consolasHealth <= 0 && manticoreHealth <= 0) {
            return new CreateEffect.Effect("Consolas has destroyed the Manticore, but at what cost?", gameLost);
        } else if (manticoreHealth <= 0) {
            return new CreateEffect.Effect("The Manticore has been destroyed! The city of Consolas has been saved!", gameWon);
        } else if (consolasHealth <= 0) {
            return new CreateEffect.Effect("Consolas has been destroyed! How can we recover from this blow?", gameLost);
        } else return new CreateEffect.Effect("We are not dead yet, let's not give up!", gameWon);
    }

    public boolean continueGame() {
        return (consolasHealth > 0 && manticoreHealth > 0);
    }
}
