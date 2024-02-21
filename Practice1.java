public class Practice1{
	public static void main(String[] args) {
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt);
		System.out.println(myDouble);
		
		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1; // Manual casting: double to int
		System.out.println(myDouble1);
		System.out.println(myInt1);
		
		// int x = 100 + 50;
		String txta = "ABCDEFGHIJKLMNOPQRSTUVWYZ";
		System.out.println("The length of the txt string is: " + txta.length());
		// More String Methods
		String txtb = "Hello World";
		System.out.println(txtb.toUpperCase());
		System.out.println(txtb.toLowerCase());
		// Finding a Character in a String
		String txtc = "Please locate where 'locate' occurs!";
		System.out.println(txtc.indexOf("locate"));
		String firstName = "John";
		String lastname = "Doe";
		System.out.println(firstName + " " + lastname);
		String firstName1 = "Johny";
		String lastName2 = "Dohny";
		System.out.println(firstName1.concat(lastName2));
		// Adding Numbers
		// int xy = 10;
		// int yz = 20;
		// int xz = xy + yz;
		// Adding two strings
		// String a = "10";
		// String b = "20";
		// String c = a + b;
		// Adding a string and a number
		// String e = "10";
		// int f = 20;
		// String g = e + f;
		// String txt1 = "We are the so called \"Vikings\" from the north.";
		// String txt2 = "It\'s alright.";
		// String txt3 = "The character \\ is called backslash.";
		// Java Math
		Math.max(5,10);
		Math.min(5,10);
		Math.sqrt(64);
		Math.abs(-4.7);
		Math.random();
		// int randomNum = (int)(Math.random() * 101);
	}
}