import java.util.Scanner;

class Op13 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");
		
		String userName = myObj.nextLine();
		System.out.println("Userrname is: " + userName);
		
		System.out.println("Enter name, age and salary:");
		String name = myObj.nextLine();
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		myObj.close();
	}
}