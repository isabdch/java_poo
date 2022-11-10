import java.util.Locale;
import java.util.Scanner;

public class AreaTrianguloSemPOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the measures of triangle X:");

		double s1_X = sc.nextDouble();
		double s2_X = sc.nextDouble();
		double s3_X = sc.nextDouble();

		double x = (s1_X + s2_X + s3_X) / 2;
		double area_X = Math.sqrt(x * (x - s1_X) * (x - s2_X) * (x - s3_X));

		System.out.println("Now enter the measures of triangle Y:");

		double s1_Y = sc.nextDouble();
		double s2_Y = sc.nextDouble();
		double s3_Y = sc.nextDouble();

		double y = (s1_Y + s2_Y + s3_Y) / 2;
		double area_Y = Math.sqrt(y * (y - s1_Y) * (y - s2_Y) * (y - s3_Y));

		System.out.printf("Triangle X area: %.4f%n", area_X);
		System.out.printf("Triangle Y area: %.4f%n", area_Y);

		if (area_X > area_Y) {
			System.out.println("Larger area: X");
		} else if (area_X == area_Y) {
			System.out.println("Both areas are equal");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}

}
