//Java InnerClass: Access OuterClass From InnerClass
class OuterClass {
	int x = 10;
	
	class InnerClass {
		public int myInnerMethod() {
			return x;
		}
	}
}

public class Op8 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.myInnerMethod());
	}
}