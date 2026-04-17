package exercicio_alturas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas seram digitadas?");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for(int i=0; i<n ; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += alturas[i];
		}
		
		double avg = sum / n;
		System.out.printf("ALTURA MÉDIA: %.2f%n", avg);
		
		double menorDeIdade = 0.0;
		for(int i=0; i<n; i++) {
			if (idades[i]<16) {
				menorDeIdade += 1;
			}
		}
		
		menorDeIdade = menorDeIdade / n * 100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menorDeIdade);
		
		for(int i=0; i<n; i++) {
			if (idades[i]<16) {
				System.out.println(nomes[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
