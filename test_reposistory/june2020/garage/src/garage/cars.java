package garage;

public class cars extends Vehicle {

	@Override
	public String toString() {
		return "cars [sound=" + sound + ", doors=" + doors + ", engine=" + engine + "]";
	}

	public cars(String sound, int doors, int engine) {
		super(sound, doors, engine);
	}

}