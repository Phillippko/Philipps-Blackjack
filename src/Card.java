import java.util.Random;

public class Card {
    private Suit suit;
    private Value value;

    Card()
    {
        this.suit = Suit.getRandom();
        this.value = Value.getRandom();
    }
    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return this.value;
    }

    public enum Value{

        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(10), QUEEN(10), KING(10), ACE(1);
        private int score;

        Value(int score)
        {
            this.score = score;
        }

        public static Value getRandom() {
            Value[] values = Value.values();
            Random rand = new Random();
            return values[rand.nextInt(values.length)];
        }

        public int getScore() {
            return score;
        }
    }

    public enum Suit {
        SPADES, CLUBS, HEARTS, DIAMONDS;

        private int score;

        public static Suit getRandom() {
            Suit[] values = Suit.values();
            Random rand = new Random();
            return values[rand.nextInt(values.length)];
        }
    }
}
