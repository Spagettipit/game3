public class Wand extends Item {


public Wand() {

super("wand");

}


public void use() {

if (Game.getCurrentRoom().getName().equals("basment")) {


System.out.println("You wave the wand and the mainRoom magically unlocks!");


Room mainRoom = Game.getCurrentRoom().getExit('e');


mainRoom.setLocked(false);


} else {


System.out.println("You wave the wand around.");

}

}

}