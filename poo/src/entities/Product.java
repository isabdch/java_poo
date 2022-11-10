package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalPrice() {
		return price * quantity;
	}

	public void addStock(int quantity) {
		this.quantity += quantity;
	}

	public void removeStock(int quantity) {
		this.quantity -= quantity;
	}

	public void showProductInfo() {
		System.out.println("");
		System.out.println("--- PRODUCT ---");
		System.out.printf("Name: %s%n", name);
		System.out.printf("Price: $%.2f%n", price);
		System.out.printf("Quantity: %d units%n", quantity);
		System.out.printf("Total price in stock: $%.2f%n", totalPrice());
		System.out.println("");
	}

}
