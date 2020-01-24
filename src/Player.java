import java.util.LinkedList;
import java.util.Scanner;

public class Player {
    public int money = Table.startMoney;
    boolean real;
    Intellect intellect;
    Hand hand;
    String name;

    Player(boolean real)
    {
        this.real = real;
        if(!real) {

            this.intellect = new AIintellect();
            this.name =  Names.genName().toString() + " " + Surnames.genSurname().toString();
        }
        else {
            this.intellect = new HumanIntellect();
            System.out.print("Please, choose your Name: ");
            this.name = new Scanner(System.in).nextLine();
        }
        this.hand = new Hand();
    }

    public void move() {
        intellect.choose(this);
    }

    public void printHand() {
        System.out.print(this.name + ": \n" );
        this.hand.print();
    }

    public static class Hand extends LinkedList<Card> {
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
}
