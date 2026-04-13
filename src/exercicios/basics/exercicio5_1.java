package exercicios.basics;

import java.util.Locale;
import java.util.Scanner;
import exercicios.entities.Rectangle;

public class exercicio5_1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf("ÁREA = %.2f%n", rect.area());
		System.out.printf("PERÍMETRO = %.2f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

		sc.close();

	}

}
