package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set <String> s = new HashSet<String>();
		s.add("Car");
		s.add("Auto");
		s.add("Scooty");
		s.add("Lory");
		System.out.println(s);
		Iterator obj = s.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		obj.remove();
		System.out.println(s);
		

	}

}
