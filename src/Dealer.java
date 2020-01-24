public class Dealer extends Player{

    Dealer(boolean real) {
        super(real);
        if(real == false)
            this.intellect = new DealerIntellect();
        this.name = "Dealer";
    }

    static void dealCard(Player player)
    {
        Card card = new Card();
        player.hand.add(card);
        player.hand.addScore(card);
    }

    public static class DealerIntellect extends AIintellect
    {
        void choose(Player player)
        {
            while(player.hand.score < 17)
                dealCard(player);
        }
    }
}
