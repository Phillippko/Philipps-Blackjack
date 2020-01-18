import java.util.Scanner;

public class Player {
    public int money;
    public int bet;
    boolean real;
    Intellect intellect;
    Hand hand;
    String name;
    Player(boolean real){
        this.real = real;
        if(!real) {
            this.intellect = new AIintellect();
            this.name =  Names.genName().toString() + Surnames.genSurname().toString();
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
        this.hand.print();
    }
}
