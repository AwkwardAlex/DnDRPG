package dice;

public class DiceSix {
    private static final int DICE_SIX = 6;
    public static int roll() {
        return (int)(Math.random() * DICE_SIX) + 1;
    }

    public static int doubleRoll() {
        return ((int)(Math.random() * DICE_SIX) + 1
                + (int)(Math.random() * DICE_SIX) + 1);
    }
}

