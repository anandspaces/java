// Java HashMap
import java.util.HashMap;
public class Op20 {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		for(String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		for(String i : capitalCities.values()) {
			System.out.println(i);
		}
		for(String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		capitalCities.get("England"); // Access an Item
		capitalCities.size(); //HashMap Size
		capitalCities.remove("England"); // To remove an Item
		capitalCities.clear(); // To remove all Items
	}
}