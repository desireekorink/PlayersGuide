package PlayersGuidePackage.Files.BossBattle2;

import java.util.Random;

public class manticoreDistance {
    static int farAway = 101;
    static int closeBy = 0;
    static Random random = new Random();
    static int distance = random.nextInt(farAway - closeBy) + closeBy;

    public static int getDistance() {
        return distance;
    }
}
