package dice;

public class DiceTen {
    public static final int DICE_TEN = 10;
    public static int roll() {
        return (int)(Math.random() * DICE_TEN) + 1;
    }

    public static int doubleRoll() {
        return ((int)(Math.random() * DICE_TEN) + 1
                + (int)(Math.random() * DICE_TEN) + 1);
    }

    public static int tripleRoll() {
        return ((int)(Math.random() * DICE_TEN) + 1
                + (int)(Math.random() * DICE_TEN) + 1
                + (int)(Math.random() * DICE_TEN) + 1);
    }
}
