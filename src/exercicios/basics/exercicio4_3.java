package exercicios.basics;
import java.util.Locale;
import java.util.Scanner;

public class exercicio4_3 {
	
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			
			double media = (x1 * 1 + x2 * 3.0 + x3 * 5.0)/10;
			System.out.printf("%f", media);
		}
		
		sc.close();
	}

}
