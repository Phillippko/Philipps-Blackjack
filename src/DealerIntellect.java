public class DealerIntellect extends AIintellect
{
    void choose(Player player)
    {
        while(player.hand.score < 17)
            Dealer.dealCard(player);
    }
}
