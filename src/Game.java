import java.util.Scanner;

public class Game {

    public static void handlePlayerTurn(Droid currentPlayer, Droid enemyPlayer, Scanner sc){
        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("1 - attack; 2 - heal; 3 - surrender.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    currentPlayer.attack(enemyPlayer);
                    validChoice = true;
                    break;
                case 2:
                    currentPlayer.heal();
                    validChoice = true;
                    break;
                case 3:
                    currentPlayer.surrender();
                    validChoice = true;
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
