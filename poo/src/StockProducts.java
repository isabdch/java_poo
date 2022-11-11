import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class StockProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Inform the name, price and quantity in stock of the product respectively:");
		
		product.name = sc.nextLine();
		product.price = sc.nextDouble();
		product.quantity = sc.nextInt();
		
		System.out.println(product.toString());
		
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
