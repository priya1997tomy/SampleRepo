package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Pappaya");
		System.out.println(list1);
		System.out.println(list1.get(3));
		list1.set(2,"Pear");
		System.out.println(list1);
		list1.add("Orange");
		System.out.println(list1.indexOf("Mango"));
		list1.add("Mango");
		System.out.println(list1);
		System.out.println(list1.lastIndexOf("Mango"));
		list1.remove(2);
		System.out.println(list1);
		boolean b = list1.contains("Apple");
		System.out.println(b);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		
		
		
	}

}
