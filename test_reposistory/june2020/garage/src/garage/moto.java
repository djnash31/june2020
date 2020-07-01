package garage;

public class moto extends Vehicle {

	public moto(String sound, int doors, int engine) {
		super(sound, doors, engine);
	}

	@Override
	public String toString() {
		return "moto [sound=" + sound + ", doors=" + doors + ", engine=" + engine + "]";
	}

}
