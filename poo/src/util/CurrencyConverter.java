package util;

public class CurrencyConverter {
	public static final double IOF = 6.0;
	
	public static double convert(double dollarPrice, double dollarQuantity) {
		double value = dollarPrice * dollarQuantity;
		
		return value + ((IOF * value) / 100);
	}
}
