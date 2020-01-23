import java.util.Scanner;

public class HumanIntellect extends Intellect {
    void choose(Player player)
    {
        Scanner sc = new Scanner(System.in);
        String input = "";
        player.hand.bet = Table.minBet;
        while(!input.equals("PASS")) {
            player.printHand();
            System.out.printf(" money: %d, bet: %d, score: %d \n", player.money, player.hand.bet, player.hand.score);
            System.out.println("DEAL - take card, PASS - pass move, DOUBLE - double bet...");
            input = sc.nextLine().toUpperCase();
            switch (input) {
                case "DEAL":
                    Dealer.dealCard(player);
                    break; //ДОБАВИТЬ МЕХАНИЗМ СТАВОК
                case "DOUBLE":
                    if(player.money >= player.hand.bet*2)
                    player.hand.bet *= 2;
                    else
                        System.out.println("Not enough money");
                    break;
            }
            if(player.hand.score  > 21) {
                System.out.println("Score is more than 21. You lose :(");
                break;
            }
        }
    }
}
