package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;

	public Aggregation2(String city, String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno+ " "+ref.address+" "+city+" "+state);
	}
	public static void main(String[] args) {
		
		Aggregation1 obj = new Aggregation1("Priya",33,"ABC");
		Aggregation2 obj1 = new Aggregation2("Kottayam","Kerala",obj);
		obj1.display();
	}

}
