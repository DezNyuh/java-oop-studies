import java.util.Locale;
import java.util.Scanner;

public class exercicio4_4 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double dividendo = sc.nextDouble();
			double divisor = sc.nextDouble();
			if (divisor != 0) {
				double total = dividendo / divisor;
				System.out.printf("%.1f%n", total);
			}
			else {
				System.out.println("Divisão impossível!");
			}
			
		}
		
		
		sc.close();
	}
}
