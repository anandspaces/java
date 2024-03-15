// Java Constructors
public class Op3{
	int x;
	public Op3(){
		x = 5;
	}
	public Op3(int y){
		x = y;
	}
	public static void main(String[] args){
		Op3 myObj = new Op3();
		System.out.println(myObj.x);
		Op3 myObj1 = new Op3(10);
		System.out.println(myObj1.x);
	}
}