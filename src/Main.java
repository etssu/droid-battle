import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello there! Welcome to my first ever Java game called Droid Battle!");
        System.out.print("Choose amount of players (1 / 2): ");
        int choice = input.nextInt();
        input.nextLine(); //to delete the '\n'

        if (choice == 1) {      // PLAYER VS AI
            DroidSetup setup = new DroidSetup(input);
            Droid playerDroid = setup.createDroidInteractive();

            if (playerDroid != null) {
                AIDroid aiDroid = AIDroid.createAIDroid(playerDroid);
                PvEGame.PveGame(playerDroid, aiDroid);
            } else {
                System.out.println("Failed to create player droid.");
            }
        } else if (choice == 2) { // PLAYER VS PLAYER
            DroidSetup setup = new DroidSetup(input);
            Droid firstPlayer = setup.createDroidInteractive();
            if (firstPlayer != null) {
                Droid secondPlayer = setup.createDroidInteractive();
                if (secondPlayer != null) {
                    PvPGame.PvpGame(firstPlayer, secondPlayer);
                } else {
                    System.out.println("Failed to create second droid.");
                }
            } else {
                System.out.println("Failed to create first droid.");
            }
        } else{
            System.out.println("Invalid choice.");
        }
    }
}