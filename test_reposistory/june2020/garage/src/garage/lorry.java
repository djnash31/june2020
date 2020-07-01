package garage;

public class lorry extends Vehicle {

	public lorry(String sound, int doors, int engine) {
		super(sound, doors, engine);
	}

	@Override
	public String toString() {
		return "lorry [sound=" + sound + ", doors=" + doors + ", engine=" + engine + "]";
	}

}
