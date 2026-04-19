package exercicios.media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int qtdPar = 0;
		double avg = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				qtdPar++;
				avg += vect[i];
			}
		}

		if (qtdPar == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			
			avg = avg / qtdPar;

			System.out.printf("MÉDIA DOS PARES = %.1f ",avg);
		}

		sc.close();
	}
}