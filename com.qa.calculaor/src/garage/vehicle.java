package garage;

public class vehicle {
	String type;
	int engineSize;
	int numberOfWheels;
	public vehicle(String type, int engineSize, int numberOfWheels) {
		super();
		this.type = type;
		this.engineSize = engineSize;
		this.numberOfWheels = numberOfWheels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

}
