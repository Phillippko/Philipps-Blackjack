import java.util.Scanner;

public class Table {

    public static int minBet = 50;
    public static int startMoney = 1000;

    public static void init() {
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
        }
        Dealer dealer = new Dealer(false);
        dealer.move();
        dealer.printHand();
        System.out.println("Dealer's score: " + dealer.hand.score);
        for (Player player: players)
        {
            if(player.hand.score > dealer.hand.score && player.hand.score <=21)
            {
                System.out.printf("%s WINS\n", player.name);
                player.money += player.hand.bet;
            }
            else if(player.hand.score < dealer.hand.score)
            {
                player.money -= player.hand.bet;
            }
            System.out.printf(" %s: score: %d, bet: %d, money: %d \n", player.name, player.hand.score, player.hand.bet, player.money);
        }

        System.out.println("Next round? YES/NO");
        if(new Scanner(System.in).nextLine().toUpperCase().equals("YES"))
        startRound(players);
    }
}
