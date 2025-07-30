import java.util.Scanner;

public class DroidSetup {
    private Scanner input;

    public DroidSetup(Scanner input) {
        this.input = input;
    }

    public Droid createDroidInteractive(){
        System.out.println("Enter droid name: ");
        String droidName = input.nextLine();

        System.out.println("\nAvailable items: ");
        Item.printItems();
        System.out.println("\nREMEMBER: You can only use 2 slots for your items.");

        Item item1 = null;
        Item item2 = null;

        while (item1 == null) {
            System.out.println("Choose first item:");
            String name = input.nextLine();
            item1 = Item.getItem(name);
            if (item1 == null) {
                System.out.println("Invalid item. Try again.");
            }
        }
        if (item1.slots == 1) {
            System.out.println("Choose second item (or press Enter to skip):");
            String secondName = input.nextLine();
            if (!secondName.isEmpty()) {
                item2 = Item.getItem(secondName);
                if (item2 == null || item1.slots + item2.slots > 2) {
                    System.out.println("Invalid or too big item. Skipping.");
                    item2 = null;
                }
            }
        } else {
            System.out.println("First item uses 2 slots. Skipping second item.");
        }

        return new Droid(droidName, item1, item2);
    }
}
