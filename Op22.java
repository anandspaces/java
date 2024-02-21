// Java Iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Op22 {
	public static void main (String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		Iterator<String> it = cars.iterator();
		
		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		Iterator<Integer> iti = numbers.iterator();
		while(iti.hasNext()) {
			Integer i = iti.next();
			if(i < 10) {
				iti.remove();
			}
		}
		System.out.println(numbers);
	}
}