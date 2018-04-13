package dice;

public class DiceTwenty {
    public static final int DICE_TWENTY = 20;
    public static int roll() {
        return (int)(Math.random() * DICE_TWENTY) + 1;
    }

    public static int doubleRoll() {
        return ((int)(Math.random() * DICE_TWENTY) + 1
                + (int)(Math.random() * DICE_TWENTY) + 1);
    }
}
