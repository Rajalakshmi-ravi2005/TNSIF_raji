package day5_wrapper_class_demo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//autoboxing - primitive to object
		//unboxing - object to primitive
		
		int x = 5;
		//autoboxing
		Integer y = Integer.valueOf(x); 
		//Integer variable = new Integer (x);
		//int y = x;
		
		//unboxing 
		
		int z = y;
		
		System.out.println(y +" "+ z);

	}

}
