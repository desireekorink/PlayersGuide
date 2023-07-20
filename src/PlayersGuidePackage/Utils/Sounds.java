package PlayersGuidePackage.Utils;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sounds {

    public static class SoundPlayer {
        private Clip clip;

        public SoundPlayer(String filePath) {
            try {
                File audioFile = new File(filePath);
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                e.printStackTrace();
            }
        }

        public void play() {
            if (clip != null) {
                clip.setFramePosition(0);
                clip.start();
                while (!clip.isRunning()) { /* wait */}
                while (clip.isRunning()) { /* wait */}
            }
        }

        public void loop(int count) {
            if (clip != null) {
                clip.loop(count);
            }
        }

        public void stop() {
            if (clip != null) {
                clip.stop();
                clip.setFramePosition(0);
            }
        }

        public boolean isPlaying() {
            return clip != null && clip.isRunning();
        }

        public static void main(String[] args) throws InterruptedException {
            List<String> audioFiles = new ArrayList<>();
            audioFiles.add("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/GameLost.wav");
            audioFiles.add("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/GameWon.wav");
            audioFiles.add("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/HardHit.wav");
            audioFiles.add("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Utils/Sounds/SoftHit.wav");

            List<SoundPlayer> soundPlayers = new ArrayList<>();

            for (String filePath : audioFiles) {
                SoundPlayer soundPlayer = new SoundPlayer(filePath);
                soundPlayers.add(soundPlayer);
            }

            for (SoundPlayer soundPlayer : soundPlayers) {
                soundPlayer.play();
                // Wait for the sound to finish (optional)
                while (soundPlayer.isPlaying()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                soundPlayer.stop();
            }
        }
    }
}

