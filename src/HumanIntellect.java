import java.util.Scanner;

public class HumanIntellect extends Intellect {
    void choose(Player player)
    {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(input!="PASS") {
            player.printHand();
            System.out.println("DEAL - take card, PASS - pass move, ...");
            input = sc.nextLine().toUpperCase();
            switch (input) {
                case "DEAL":
                    Dealer.dealCard(player);

                    break; //ДОБАВИТЬ МЕХАНИЗМ СТАВОК
            }
            if(player.hand.score  > 21) {
                System.out.println("Score is more than 21. You lose :(");
                break;
            }
        }
    }
}
