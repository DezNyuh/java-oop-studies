package exercicios.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i=0;i<n;i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		double[] avg = new double[n];
		
		for(int i=0;i<n;i++) {
			avg[i] = (nota1[i] + nota2[i]) / 2; 
		}
		
		
		for(int i=0;i<n;i++) {
			if (6.0<=avg[i]) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();

	}

}
