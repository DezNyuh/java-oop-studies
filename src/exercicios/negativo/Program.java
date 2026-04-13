package exercicios.negativo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");

		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			vect[i] = num;
		}

		System.out.println("NÚMEROS NEGATIVOS: ");

		for (int i = 0; i < vect.length; i++) {
			if (0 > vect[i]) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
