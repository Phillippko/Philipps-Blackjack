public class Player {
    boolean real;
    Intellect intellect;
    Player(boolean real){
        this.real = real;

        if(!real)
            intellect = Desk.giveAI(real);
        Hand hand = new Hand();
    }

    public void move() {

    }
}
