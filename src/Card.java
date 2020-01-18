
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
}
