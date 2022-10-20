package hexlet.code;

import java.util.Random;

public class Util {
    public static int getRandomizedNumbers(int bottomBorder, int upperBorder) {
        int diff = upperBorder - bottomBorder;
        Random rn = new Random();
        return rn.nextInt(diff + 1) + bottomBorder;
    }
}
