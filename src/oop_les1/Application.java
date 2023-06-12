package oop_les1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Het werkt !");
		// Maak in totaal 2 bijen aan en vul alle properties.

		Bee bij1 = new Bee();
		bij1.age = 10;
		bij1.color = "yellow";
		bij1.dangerous = true;
		bij1.flying = true;
		bij1.honey_quantity = 5;
		bij1.naam = "Happy Bee";
		bij1.queen = false;
		bij1.speed = 25;

		Bee bij2 = new Bee();
		bij2.age = 100;
		bij2.color = "orange";
		bij2.dangerous = false;
		bij2.flying = false;
		bij2.honey_quantity = 0;
		bij2.naam = "Queen Bee";
		bij2.queen = true;
		bij2.speed = 6;

		bij1.doeIets();
		bij1.doeIetsAnders();
		bij1.doeIetsTotaalAnders();

		bij2.doeIets();
		bij2.doeIetsAnders();
		bij2.doeIetsTotaalAnders();

		bij1.stelSnelheidIn(5);
		bij2.stelSnelheidIn(20);

		bij1.stelNaamIn("Queen Bee");
		bij1.stelKoningingschapIn(true);
		bij1.stelLeeftijdIn(100);

		bij2.stelNaamIn("Peasant Bee");
		bij2.stelKoningingschapIn(false);
		bij2.stelLeeftijdIn(10);

		int snelheid = bij1.watIsDeSnelheid();
		System.out.println("Snelheid = " + snelheid);

		Bee bij3 = new Bee(12);
		Bee bij4 = new Bee(7, 20, 30, true, false, true, "red", "Carry Bee");

		// Animal is abstract en mag niet worden aangemaakt
//		Animal animal1 = new Animal();
//		// animal1.name -- Dit mag niet
//		animal1.setName("Worfie");

		Cat cat1 = new Cat();
		cat1.setName("Poes");
		cat1.makeSound();

		Animal anyAnimal = new Cat();
		printAnimal(anyAnimal);

		// Maak 3 sub classes aan en vul die met gegevens d.m.v. setters

		Otter otter1 = new Otter();
		otter1.setName("Larry");
		otter1.setAge(5);
		otter1.makeSound();

		Anteater anteater1 = new Anteater();
		anteater1.setName("Justin");
		anteater1.setAge(20);
		anteater1.makeSound();
		
		Seagull seagull1 = new Seagull();
		seagull1.setName("Alby");
		seagull1.setAge(2);
		seagull1.makeSound();
		
		String name = bij2.watIsDeNaam();
		boolean vliegen = bij2.isZeAanHetVliegen();
		int leeftijd = bij2.watIsDeLeeftijd();

		System.out.println("Mijn naam is " + name);
		System.out.println("Ik vlieg: " + vliegen);
		System.out.println("Ik ben " + leeftijd + " dagen oud");
		
		Boardgame boardgame1 = new Boardgame();
		boardgame1.setName("The Chronicles of Narnia: the Closet and the whatever thingy - the Game");
		boardgame1.setSellable(true);
		int prijs1 = boardgame1.getPrice();
		System.out.println("Prijs van \"" + boardgame1.getName() + "\" is: " + prijs1);
		
		Painting painting1 = new Painting();
		painting1.setName("Dhûrmuli Axemantle, War Cleric of the Eternally Vigilant Gorm Gulthyn");
		painting1.setSellable(false);
		int prijs2 = painting1.getPrice();
		System.out.println("Prijs van \"" + painting1.getName() +"\" is: " + prijs2);
	
		Fan fan1 = new Fan();
		fan1.setName("Metal Fan");
		fan1.setSellable(true);
		int prijs3 = fan1.getPrice();
		System.out.println("Prijs van \"" + fan1.getName() +"\" is: " + prijs3);
	}
	
	public static void printAnimal(Animal animal) {
		animal.makeSound();
	}
	
	// Abstract Product
	// name String
	// sellable boolean
	// abstract int getPrice()
	
	// 3 product sub classes en in applcation maak 3 producten aan
	// en geef de prijzen weer
}