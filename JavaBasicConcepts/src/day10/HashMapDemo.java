package day10;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {

		HashMap <Integer, String>hm=new HashMap<Integer, String>();
		//adding pairs to HashMap
		hm.put(101, "John");
		hm.put(102, "David");
		hm.put(103, "Sam");
		hm.put(104, "Kim");
		hm.put(105, "Kimi");
		System.out.println(hm);
		
		//remove a pair
		hm.remove(103);
		System.out.println(hm);
		
		//how to read pairs in HashMap
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
