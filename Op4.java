//Java Inheritance
class Vehicle {
	protected String brand = "Ford";
	protected void honk() {
		System.out.println("Tuut, tuut!");
	}
}

class Op4 extends Vehicle {
	private String modelName = "Mustang";
	public static void main(String[] args) {
		Op4 myCar = new Op4();
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.modelName);
	}
}