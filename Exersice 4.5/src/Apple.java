
public class Apple extends Fruit{
private double price, weight;
	
	public Apple (String name,double price, double weight) {
		super(name);
        this.weight = weight;
		this.price = price;
	//overloading
		    
		        if (this.weight < 13) {
		            totalprice(); //overloading with no arguments
		            System.out.println("If weight less than 10 kg, Total price: RM" + totalprice());
		        
		        }
		            else if (this.weight > 13 && this.weight < 50) {
		            double pp = 1.99;
		            totalprice(pp); //overloading with 1 argument
		            System.out.println("If weight MORE than 10 kg, Total price: RM" + totalprice(pp));
		        }
		        
		            else {
		            double pr = 1.00;
		            int ww = 50; 
		            totalprice(ww, pr); //overloading with 2 arguments
		            System.out.println("If weight MORE than 50 kg, Total price: RM" + totalprice(pr, ww));
		            
		            }
}
		        
				public double totalprice() {
		        	return this.price * this.weight;
		        }
		        public double totalprice(double pp) {
		        	return pp * this.weight;
		        }
		        public double totalprice(double pr, double ww) {
		        	return pr * ww;
		        }
	//overriding
	public String toString() {
		return "The Fruit is: " + name ;
	} 
}