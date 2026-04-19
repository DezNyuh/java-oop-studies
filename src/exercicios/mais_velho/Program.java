package exercicios.mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idades: ");
			idades[i] = sc.nextInt();
		}
		
		int maisVelha = idades[0];
		int posicao = 0;
		System.out.print("PESSOA MAIS VELHA: ");
		
		for(int i=1; i<n; i++) {
			if(maisVelha<idades[i]) {
				maisVelha = idades[i];
				posicao = i;
			}
		}
		
		System.out.printf(nomes[posicao]);
		
		
		
		
		
		sc.close();

	}

}
