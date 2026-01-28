package collection;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {

	public static void main(String[] args) {
		Set <String>set1= new HashSet<String>();
		set1.add("Apple");
		set1.add("Mango");
		set1.add("Orange");
		
		int a[][] = {{1,2,3},{3,4,6}};
		{
			for(int i[] : a)
			{
				for(int j : i)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		for(String elements : set1)

		{
			System.out.println(elements+ " ");
		}
	}

}
