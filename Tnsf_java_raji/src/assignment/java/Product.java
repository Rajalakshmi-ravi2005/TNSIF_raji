package assignment.java;

public class Product {
	
	String product_name;
	double price;
	int quantity;
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
class Demo {
	// sub class which means class under another class.
}