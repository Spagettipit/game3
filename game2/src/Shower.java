
public class Shower extends Item {
    public Shower() {
        super("Shower");
        setDesc("A shower in the room.");
    }

    public void use() {
        if (hasGooInInventory()) {
            // Remove goo from the player's inventory here
            System.out.println("You use the shower, and the goo is washed away.");
        } else {
            System.out.println("You are not dirty; there's no need to use the shower.");
        }
    }

    private boolean hasGooInInventory() {
        // Check if the player has goo in their inventory
        return false; // Implement this logic to check for goo in the player's inventory
    }
}