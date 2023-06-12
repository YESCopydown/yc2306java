package oop_les1;

public class Bee {

	// Properties

	public int speed;

	// int (Integer) => hele getal

	// boolean => true / false

	// String => Tekst oneindig lang zijn

	// maak in totaal 5 properties aan

	public boolean flying;

	public String color;

	public String naam;

	public int age; // Days

	public boolean dangerous;

	public boolean queen;

	public int honey_quantity;

	// Constructors

	// No arguments constructor
	public Bee() {
		System.out.println("In constructor");
	}

	public Bee(int speed) {
		this.speed = speed;
	}

	// Geef Bee een constructor die alle properties instelt.

	public Bee(int speed, int age, int honey_quantity, boolean flying, boolean queen, boolean dangerous, String color,
			String naam) {
		this.age = age;
		this.color = color;
		this.dangerous = dangerous;
		this.flying = flying;
		this.honey_quantity = honey_quantity;
		this.naam = naam;
		this.queen = queen;
		this.speed = speed;
	}

	// Methods

	public void doeIets() {
		System.out.println("In doe iets. Name is " + naam);
	}
	// 2 methods maken en in elk method print je 1 property uit
	// Roep de 2 methods aan

	public void doeIetsAnders() {
		System.out.println("Age is " + age);
	}

	public void doeIetsTotaalAnders() {
		System.out.println("Honey currently carried is " + honey_quantity);
	}

	public void stelSnelheidIn(int snelheid) {
		speed = snelheid;
	}

//	public void stelSnelheidIn(int speed) {
//		this.speed = speed;
//	}

	// Maak 3 (1 int, 1 boolean, 1 String) methods om lokale properties in te
	// stellen. Roep die aan.

	public void stelNaamIn(String name) {
		naam = name;
	}

	public void stelKoningingschapIn(boolean koningin) {
		queen = koningin;
	}

	public void stelLeeftijdIn(int leeftijd) {
		age = leeftijd;
	}

	public int watIsDeSnelheid() {
		return speed;
	}

	// Maak 3 methods om in elk method 1 property terug te geven. Print die in
	// application.

	public String watIsDeNaam() {
		return naam;
	}

	public boolean isZeAanHetVliegen() {
		return flying;
	}

	public int watIsDeLeeftijd() {
		return age;
	}

}
