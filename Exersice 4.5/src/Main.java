
public class Main {

	public static void main(String[] args) {
		System.out.println("+========Welcome======+");
		Fruit a = new RedApple("RedApple","Sweet", "RedApple", 20, 3);
		System.out.println(a);
		System.out.println();
		
		
		Fruit g = new Greengrape("Greengrape", "Sweet", "Greengrape", 15, 50);
		System.out.println(g);
		System.out.println();
		
		Apple b = new RedApple("Apple", "Sweet", "RedApple", 15, 2);
		System.out.println(b);
		System.out.println();
		
		RedApple e = new RedApple ("RedApple","Sweet", "RedApple", 20, 3);
		System.out.println(e);
		System.out.println();
		
		grape c = new Greengrape("grape", "Sweet", "Greengrape", 19, 3);
		System.out.println(c);
		System.out.println();
		
		Greengrape d = new Greengrape("Greengrape", "Sweet", "Greengrape", 15, 50);
		System.out.println(d);
		System.out.println("+============Thank You============+");		
	}

}
