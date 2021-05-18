
public class Greengrape extends grape {
protected String taste, typeFruit;

	
	public Greengrape(String name, String taste, String typeFruit, double price, double weight) {
	super(name, price, weight);
	this.taste = taste;
	this.typeFruit = typeFruit;
	}

	//getter
	public String gettaste() {
		return this.taste;
	}
	public String gettypeFruit() {
		return this.typeFruit;
	}
	//overriding
	public String toString() {
		return "The Fruit is: " + name + "\nthe taste is : " + taste + "\nThe type of fruit : " + typeFruit;
	}

	


}
