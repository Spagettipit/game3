public class Potion extends Item {

    public Potion() {
        super("Potion");
        this.setDesc("A magical potion that can restore your health or provide special abilities.");
    }

    @Override
    public void use() {
        // Implement the specific logic for using the potion, such as restoring health or granting abilities
        System.out.println("You drink the potion, and it restores your health or grants you a special ability.");
    }
}