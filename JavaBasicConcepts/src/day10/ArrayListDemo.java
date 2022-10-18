package day10;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("welcome");
		list.add('a');
		list.add(true);
		list.add(1);
		list.add(1.1);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.add(1,"java");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		for(Object i:list) {
			System.out.println(i);
		}
			
	}

}
