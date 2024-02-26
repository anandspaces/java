// Java Class Methods
public class Op2 {
	// Static Method
	static void myMethod(){
		System.out.println("Hello World!");
		System.out.println("Static Methods can be called without creating objects");
	}
	// Public Method
	public void myPublicMethod(){
		System.out.println("Public methods can be alled by creating objects");
	}
	public static void main(String[] args){
		myMethod();
		Op2 myObj = new Op2();
		myObj.myPublicMethod();
	}
}