package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VottingException {
		int age =16;
		if(age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new VottingException("Not eligible age under 18!!!");
		}

	}

}
