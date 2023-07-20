package PlayersGuidePackage.Utils;

import javax.sound.sampled.*;

public class AudioCapabilitiesChecker {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfos = AudioSystem.getMixerInfo();

        for (Mixer.Info mixerInfo : mixerInfos) {
            System.out.println("Mixer: " + mixerInfo.getName());

            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getSourceLineInfo();

            for (Line.Info lineInfo : lineInfos) {
                if (lineInfo.getLineClass().equals(SourceDataLine.class)) {
                    SourceDataLine.Info sourceInfo = (SourceDataLine.Info) lineInfo;
                    AudioFormat[] formats = sourceInfo.getFormats();

                    System.out.println("Supported audio formats:");
                    for (AudioFormat format : formats) {
                        System.out.println(format);
                    }
                }
            }

            System.out.println();
        }
    }
}
