// Java Class Attrbutes
public class Op1 {
	int x = 5;
	final int y = 10;
	String fname = "Anand";
	String lname = "Vaibhaw";
	public static void main(String[] args){
		Op1 myObj = new Op1();
		myObj.x = 40;
		myObj.x = 25;
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		System.out.println("Name: " + myObj.fname + "" + myObj.lname);
	}
}