// Java ArrayList
import java.util.ArrayList;
import java.util.Collections;
public class Op18 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		for (int i = 0; i< cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		Collections.sort(cars);
		for (String i : cars) {
			System.out.println(i);
		}
		cars.get(0); // Access an Item
		cars.set(0, "Ope1"); // Change an Item
		cars.size(); // ArrayList Size
		cars.remove(0); // To remove an element
		cars.clear(); // To remove all element
	}
}