package PlayersGuidePackage.Files;

import java.util.Arrays;
import java.util.List;

public class Countdown {
        public static void main(String[] args) {
            List<Integer> numbersList = Arrays.asList(11,10,9,8,7,6,5,4,3,2,1);
            for (int number : numbersList) {
                number--;
                System.out.println(number);
            }

        }}

