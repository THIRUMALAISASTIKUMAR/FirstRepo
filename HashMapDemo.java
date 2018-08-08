package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("Kiruthik", 12);
		hm.put("Vihesh", 14);
		hm.put("Subha", 16);
		hm.put("Thiru", 18);
		hm.put("Malai", 20);
		hm.put("", 22);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
