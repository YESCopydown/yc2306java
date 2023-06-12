package oop_les1;

public class Boardgame extends Product {

	public int getPrice() {
		return 100 - this.getName().length();
	}
}
