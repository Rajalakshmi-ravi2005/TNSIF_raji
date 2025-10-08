package assignment.java;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		
		p1.setProduct_name("Shampoo");
		p1.setPrice(120.50);
		p1.setQuantity(10);
		
		System.out.println(p1);
		
		Product p2 = new Product();
		
		p2.setProduct_name("Soap");
		p2.setPrice(54.35);
		p2.setQuantity(15);
		
		System.out.println(p2);
	}

}