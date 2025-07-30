import java.util.Scanner;

public class PvEGame {

    public static void PveGame(Droid playerDroid, AIDroid aiDroid){
        int moveCount = 0;
        Scanner sc = new Scanner(System.in);

        while (playerDroid.HP > 0 && aiDroid.HP > 0){
            if (moveCount % 2 == 0){
                Game.handlePlayerTurn(playerDroid, aiDroid, sc);
            } else {
                if (!aiDroid.hasHealed && aiDroid.HP <= 80){ // so that AI droid doesn't heal when its HP is full
                    int aiChoice = (int)(Math.random() * 2);
                    switch (aiChoice) {
                        case 0:
                            aiDroid.attack(playerDroid);
                            break;
                        case 1:
                            aiDroid.heal();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                } else {
                    aiDroid.attack(playerDroid);
                }
            }
            moveCount++;
            System.out.println("Player " + playerDroid.name + " HP: " + playerDroid.HP);
            System.out.println("Player " + aiDroid.name + " HP: " + aiDroid.HP);
            System.out.println();
        }
        if (playerDroid.HP <= 0 ) {
            System.out.println("Player " + playerDroid.name + " defeated.");
        } else {
            System.out.println("Player " + aiDroid.name + " defeated.");
        }
    }
}
