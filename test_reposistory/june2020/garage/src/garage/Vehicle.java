package garage;

public abstract class Vehicle {
public String sound;
public int doors;
public int engine;
public Vehicle(String sound, int doors, int engine) {
	super();
	this.sound = sound;
	this.doors = doors;
	this.engine = engine;
}
public String getSound() {
	return sound;
}
public void setSound(String sound) {
	this.sound = sound;
}
public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public int getEngine() {
	return engine;
}
public void setEngine(int engine) {
	this.engine = engine;
}



}
