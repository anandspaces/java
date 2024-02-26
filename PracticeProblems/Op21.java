// Java HashSet
import java.util.HashSet;

public class Op21 {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
		for (String i : cars) {
			System.out.println(i);
		}
		cars.contains("Mazda"); // Check if an Item Exist
		cars.size(); // HashSet Size
		cars.remove("Volvo"); // To remove an item
		cars.clear(); // To remove all items
	}
}