import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class AreaTringuloComPOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X:");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Now enter the measures of triangle Y:");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.calcArea();
		double areaY = y.calcArea();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else if (areaX == areaY) {
			System.out.println("Both areas are equal");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}

}
