import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.println("Hello there! Welcome to my first ever Java game called Droid Battle!");
        System.out.print("Choose amount of players (1 / 2): ");
        int choice = input.nextInt();
        if (choice == 1) {
            // PLAYER VS AI
            System.out.println("player vs ai");
        } else if (choice == 2) {
            // PLAYER VS PLAYER
            System.out.println("player vs player");
        } else{
            System.out.println("Invalid choice.");
        }
    }
}