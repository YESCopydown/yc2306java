package oop_les1;

public abstract class Product {

	private String name;
	
	private boolean sellable;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSellable() {
		return sellable;
	}

	public void setSellable(boolean sellable) {
		this.sellable = sellable;
	}

	public abstract int getPrice();
}
