public class Chain extends Item {
    public Chain() {
        super("Chain");
        setDesc("A chain hanging from the ceiling.");
    }

    @Override
    public void use() {
        if (!isUsed()) {
            setUsed(true);
            System.out.println("You touch the chain, and goo pours over you. You now have goo in your inventory.");
            // Add goo to the player's inventory here
        } else {
            System.out.println("The chain is empty now.");
        }
    }
}