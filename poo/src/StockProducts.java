import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class StockProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inform the name, price and quantity in stock of the product respectively:");
		
		String name = sc.nextLine();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println(product);
		
		System.out.println("Inform the quantity you want to add in stock:");
		
		int add = sc.nextInt();
		
		product.addStock(add);
		System.out.println(product.toString());
		
		System.out.println("Now inform the quantity you want to remove in stock:");
		
		int remove = sc.nextInt();
		
		product.removeStock(remove);
		System.out.println(product.toString());
		
		sc.close();
	}

}
