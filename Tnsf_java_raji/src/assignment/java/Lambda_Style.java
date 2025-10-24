package assignment.java;

public class Lambda_Style {
	
	public interface Find_Factorial4 {

		int factorial(int num);

	}

	public static void main(String[] args) {
		
		Find_Factorial4 fact = (num) ->
		{
			int i, f=1;
			for(i = 1; i <= num; i++) {
				f = f*i;
			}
			return f;
		};
		
		System.out.print("Factorial is : " + fact.factorial(7));
	}
}
