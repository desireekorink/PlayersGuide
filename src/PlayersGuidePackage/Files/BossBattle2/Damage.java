package PlayersGuidePackage.Files.BossBattle2;

import PlayersGuidePackage.Utils.Color;

public class Damage {
    BossBattle bossBattle;

    public Damage(BossBattle bossBattle) {
        this.bossBattle = bossBattle;
    }

    int round = 1;

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

    public void doRoundOfDamage(int userInput) {
        int blast = calculateBlast(round);

        CreateEffect.Effect hitManticore = didUserInputHit(userInput, blast);

        System.out.println(hitManticore.message());
        hitManticore.sound().play();
        round++;
    }

    private CreateEffect.Effect didUserInputHit(int userInput, int blast) {
        int distance = manticoreDistance.getDistance();

        bossBattle.consolasHealth--;

        if (userInput == distance) {
            bossBattle.manticoreHealth -= blast;
            if (blast == 10) {
                return new CreateEffect.Effect(Color.YELLOW_BOLD + "That round was a DIRECT HIT!" + Color.RESET, bossBattle.hardHit);
            } else if (blast == 3) {
                return new CreateEffect.Effect(Color.RED_BOLD + "That round was a DIRECT HIT!" + Color.RESET, bossBattle.hardHit);
            } else {
                return new CreateEffect.Effect("That round was a" + Color.MAGENTA_BOLD + " DIRECT HIT!" + Color.RESET, bossBattle.softHit);
            }
        } else if (userInput < 0) {
            return new CreateEffect.Effect("That round " + Color.MAGENTA_BOLD + "HIT OUR BASE!" + Color.RESET, bossBattle.softHit);
        } else if (userInput > 100) {
            return new CreateEffect.Effect("That round " + Color.MAGENTA_BOLD + "HIT THE OTHER TOWN." + Color.RESET, bossBattle.softHit);
        } else if (userInput > distance) {
            return new CreateEffect.Effect("That round" + Color.MAGENTA_BOLD + " OVERSHOT" + Color.RESET + " the target.", bossBattle.softHit);
        } else {
            return new CreateEffect.Effect("That round" + Color.MAGENTA_BOLD + " FELL SHORT" + Color.RESET + " of the target.", bossBattle.softHit);
        }

    }
}
