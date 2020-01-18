import java.util.Random;

public enum Suit {
    SPADES, CLUBS, HEARTS, DIAMONDS;

    private int score;

    public static Suit getRandom() {
        Suit[] values = Suit.values();
        Random rand = new Random();
        return values[rand.nextInt(values.length)];
    }
}
