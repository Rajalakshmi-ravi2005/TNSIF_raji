//Program to demonstrate abstraction
package day2_oops_abstraction;

public class Square extends Shape{ // extends is the keyword which is inherited from parent class. Here shape is the parent class and square is the child class
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side) // constructor is the one which stores not only the value, also its methods and properties too.
	{
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;		
	}
}

