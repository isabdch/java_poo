import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números para saber qual é o maior deles: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}

		return aux;
	}
	
	public static void showResult(int result) {
		System.out.println("O maior número é: " + result);
	}
	
}
