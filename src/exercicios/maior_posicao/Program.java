package exercicios.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int maiorNumero = 0;
		int posicao = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maiorNumero) {
				maiorNumero = vect[i];
				posicao = i;
			}
		}

		System.out.println();
		System.out.printf("MAIOR NÚMERO = %d", maiorNumero);
		System.out.printf("\nPOSIÇÃO DO MAIOR NÚMERO = %d", posicao);

		sc.close();

	}

}
