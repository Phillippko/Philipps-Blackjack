import java.util.Random;

public class Desk {

    public static String giveAI(boolean real) {
        if(real == true)
            return "human";
        Random rand = new Random();
        //ENUM
    }

    public static void startRound(Player[] players) {
        for(Player player: players)
        {
            player.move(player.intellect);
        }
    }

    public static void init() {
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        int playersNum = 2;
        Player players[] = new Player[playersNum];
        boolean real = true;
        for (Player player: players) {
            player = new Player(real);
            real = false;
        }
        startRound(players);
    }
}
