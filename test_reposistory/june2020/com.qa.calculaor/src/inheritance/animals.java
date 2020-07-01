package inheritance;

public class animals {
 
	private String name;
	private int age;
	private int speed;
	
	public animals(String name, int age) {
		this.name= name;
		this.age=age;
	}
	public animals(int speed) {
	this.speed=speed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	
		
	
	
	
}
