import java.util.LinkedList;
public class Hand extends LinkedList<Card> {
    int score = 0;
    public void print() {
        for (Card card: this)
        {
            System.out.print(card.getSuit() + "," + card.getValue() + "; ");
        }
        System.out.println("score: " + score);
    }
    public void addScore(Card card) {
        score += card.getValue().getScore();
    }
}
