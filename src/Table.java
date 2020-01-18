public class Table {

    public static void init() {
        Dealer dealer = new Dealer(false);
        int playersNum = 2;
        Player[] players = new Player[playersNum];
        boolean real = true;
        for (int i = 0; i < playersNum; i++) {
            players[i] = new Player(real);
            real = false;
        }
        startRound(players);
    }

    public static void startRound(Player[] players)
    {
        for (Player player: players) {
            player.move();
            System.out.printf("%s%n score: %d, bet: %d, money: %d", player.name, player.hand.score, player.bet, player.money);
        }
        startRound(players);
    }
}
