import java.util.LinkedList;

public class Hand extends LinkedList<Card> {
    public int bet;
    int score = 0;

    public void print() {
        System.out.print("  HAND: ");
        if (this.isEmpty())
            System.out.print("Empty");
        else
            for (Card card : this)
            {
                System.out.print("(" + card.getSuit() + "," + card.getValue() + "); ");
            }
        System.out.println();
    }

    public void addScore(Card card) {
        score += card.getValue().getScore();
    }
}
