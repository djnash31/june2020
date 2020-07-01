package garage;

public class Runner {
	public static void main(String[] args) {

		garage g = new garage();

		g.addVehicle(new cars("Yes", 4, 2));
		g.addVehicle(new cars("No", 15, 10));

		g.printVehicles();

	}
}
