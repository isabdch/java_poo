package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalPrice() {
		return price * quantity;
	}

	public void addStock(int quantity) {
		this.quantity += quantity;
	}

	public void removeStock(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "\n--- PRODUCT ---\n" + "Name: " + name + "\n" + "Price: $" + String.format("%.2f", price) + "\n"
				+ "Quantity in stock: " + quantity + " units\n" + "Total price in stock: $"
				+ String.format("%.2f", totalPrice()) + "\n";
	}

}
