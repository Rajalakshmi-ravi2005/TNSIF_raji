package day5_interfacedemo;

public class FunctionalDemo {

	public static void main(String[] args) {
	
		//Lambda Expression
		GreetingDemo gd = () -> 
		System.out.println("Hello Everyone, Welcome to the Java Session");
		
		gd.greet();
		
		

	}

}



/* without implement keyword we are getting the output because of calling the class name of another class . 
In interface it will be accessible without using implements because static method are default, so we don't 
need to call.*/