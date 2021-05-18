
public abstract class Fruit {
	protected String name;
	 
    public Fruit(String name) {
    this.name = name;  
	}

    //
    public abstract double totalprice();
    public abstract double totalprice(double pp);
    public abstract double totalprice(double pr, double ww);
}
