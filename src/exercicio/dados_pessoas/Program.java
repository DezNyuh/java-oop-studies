package exercicio.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < n; i++) {	
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
		}

		double menorAltura = alturas[0];
		double maiorAltura = alturas[0];

		for (int i = 0; i < n; i++) {
			if (maiorAltura < alturas[i]) {
				maiorAltura = alturas[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (menorAltura > alturas[i]) {
				menorAltura = alturas[i];
			}
		}

		double alturaMulheres = 0.0;
		double totalMulheres = 0.0;
		int totalHomens = 0;

		for (int i = 0; i < n; i++) {
			if (generos[i] == 'F') {
				totalMulheres++;
				alturaMulheres += alturas[i];
			} else {
				totalHomens++;
			}
		}
		
		double avg = alturaMulheres / totalMulheres;

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", avg);
		System.out.printf("Total de homens = %d", totalHomens);

		sc.close();

	}

}
