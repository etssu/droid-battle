import java.util.Scanner;

public class PvPGame {

    public static void PvpGame(Droid firstPlayer, Droid secondPlayer){
        int moveCount = 0;
        Scanner sc = new Scanner(System.in);

        while (firstPlayer.HP > 0 && secondPlayer.HP > 0){
            if (moveCount % 2 == 0){        // first player turn
                System.out.printf("%s's turn.\n", firstPlayer.name);
                Game.handlePlayerTurn(firstPlayer, secondPlayer, sc);
            } else { // second player turn
                System.out.printf("%s's turn.\n", secondPlayer.name);
                Game.handlePlayerTurn(secondPlayer, firstPlayer, sc);
            }
            moveCount++;
            System.out.println("Player " + firstPlayer.name + " HP: " + firstPlayer.HP);
            System.out.println("Player " + secondPlayer.name + " HP: " + secondPlayer.HP);
            System.out.println();
        }

        if (firstPlayer.HP < 0){
            System.out.printf("Player %s wins!\n", firstPlayer.name);
        } else {
            System.out.printf("Player %s wins!\n", secondPlayer.name);
        }
    }
}
