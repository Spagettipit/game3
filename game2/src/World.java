public class World {


public static Room buildWorld() {
				
	Room basment = new Room("basement", "You are in the basement there is a wand in there that seems to peak your instrest ");

	Room mainRoom = new Room("mainRoom" ,"You are in what seems to be the entrance of a house. There is a chest on the floor, it looks very heavy ");

	Room livingRoom = new Room("livingRoom", "You are in the living room. There is a NAPKIN with something written on it on the floor but you cannot see what it says from here");

	Room kitchen = new Room(" kitchen" , "You are in the kitchen. there seems to be a key");

	Room bathroom = new Room("bathroom", "You are in the main bathroom.");

	Room bedroom = new Room("bedroom" , "You are in what seems to be the main bedroom. You see a Wallet on a beside table");

	mainRoom.addExit(livingRoom, 'e');

	mainRoom.addExit(kitchen, 'w');

	mainRoom.addExit(bathroom, 'n');

	mainRoom.addExit(bedroom, 's');

	mainRoom.addExit(basment, 'd');
	
	livingRoom.addExit(mainRoom, 'w');
	Item napkin = new Item("napkin");
	napkin.setDesc("It's a napkin, it seems that someone has written the code 7645 on it.");
	livingRoom.addItem(napkin);
	livingRoom.setLocked(true);


	kitchen.addExit(mainRoom, 'e');
	Item key = new Key();
	key.setDesc("It's an old key. Looks a bit rusted and you dont know if it will work on anything.");
	kitchen.addItem(key);
	
	mainRoom.addExit(basment, 'd');
	Item chest = new Item("chest");
	chest.setDesc("It is a large, heavy chest but it seems to be lockde");
	chest.setHeavy(true);
	mainRoom.addItem(chest);

	bathroom.addExit(mainRoom, 's');

	bedroom.addExit(mainRoom, 'n');
	Item wallet = new Item("wallet");
	wallet.setDesc("a Wallet, it seems to have very little money it in, an old family photo that you cannot make the faces out of as it is so torn, and it seems to have some old cards inside");
	bedroom.addItem(wallet);

	basment.addExit(mainRoom, 'u');
	Item wand = new Wand();
	wand.setDesc("The wand glows with with a strange light making you wonder where it comes from");
	basment.addItem(wand);

	return mainRoom;
}
}















