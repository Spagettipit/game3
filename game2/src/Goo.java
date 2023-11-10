public class Goo extends Item {

    public Goo() {
        super("Goo");
        this.setDesc("Sticky goo in your inventory.");
        this.setHeavy(true); // Assuming goo is heavy
    }

    @Override
    public void look() {
        System.out.println("You examine the goo. It's a sticky, unpleasant substance.");
    }
}