public class Dealer extends Player{

    Dealer(boolean real) {
        super(real);
    }

    static void dealCard(Player player)
    {
        Card card = new Card();
        player.hand.add(card);
        player.hand.addScore(card);
    }
}
