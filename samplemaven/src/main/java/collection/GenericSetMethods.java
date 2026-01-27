package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String>s1 = new HashSet<String>();
		Set<String>s2 = new HashSet<String>();
		s1.add("Black");
		s1.add("White");
		s1.add("Red");
		s2.add("Green");
		s2.add("Orange");
		s2.add("Green");
		s1.addAll(s2);
		System.out.println(s1);
		System.out.println(s1.containsAll(s2));
		boolean t = s1.isEmpty();
		System.out.println(t);
		s1.removeAll(s2);
		System.out.println(s1);
		s1.clear();
		System.out.println(s1);
		
		
		
		

	}

}
