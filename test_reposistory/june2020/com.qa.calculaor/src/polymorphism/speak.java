package polymorphism;

public class speak {
public static void main(String[] args) {
	animal a = new animal();
	a.speak();
	
	kit cat1 = new kit();
	cat1.speak();
	System.out.println(cat1);
}
}
