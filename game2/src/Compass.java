public class Compass extends Item {

    public Compass() {
        super("Compass");
        this.setDesc("A magical compass that always points you in the right direction.");
    }

    @Override
    public void use() {
        // Implement the specific logic for using the compass, like guiding the player in the correct direction
        System.out.println("You follow the compass, and it leads you in the right direction, helping you find your way.");
    }
}