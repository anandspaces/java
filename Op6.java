//Java InnerClass
class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
	
	// private class InnerPrivateClass {
	// 	int y = 1;
	// }
}

public class Op6 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}
}