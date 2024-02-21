//Enums
public class Op12 {
	enum Level {
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
		Level myVar1 = Level.MEDIUM;
		switch(myVar1) {
			case LOW:
				System.out.println("Low level");
				break;
			case MEDIUM:
				System.out.println("Medium level");
				break;
			case HIGH:
				System.out.println("High level");
				break;
		}
		for (Level myVar2 : Level.values()) {
			System.out.println(myVar2);
		}
	}
}
