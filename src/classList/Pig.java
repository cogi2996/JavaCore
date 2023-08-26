package classList;

public class Pig implements Animal {
	enum Level {
		LOW, MEDIUM, HIGH
	}

	public void animalSound() {
		System.out.println(Level.LOW);
		
	}

	public void sleep() {
		System.out.println("Zzz - ot ot");
	}
}