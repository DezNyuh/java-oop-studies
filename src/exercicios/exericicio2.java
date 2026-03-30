import java.util.Scanner;

public class exericicio2 {
	public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	
	/*int numeroInt;
	
	numeroInt = sc.nextInt();
	if (numeroInt > 0) {
		System.out.println("NÃO NEGATIVO");
		}
	else {System.out.println("NEGATIVO");
	}
	
	/* ===================================================== *\
	
	int parImpar;
	
	parImpar = sc.nextInt();
	
	if (parImpar % 2 == 0) {System.out.println("PAR");}
	else {System.out.println("IMPAR");}*/
	
	/*======================================================= */
	
	
	/*int multi1, multi2;
	
	multi1 = sc.nextInt();
	multi2 = sc.nextInt();
	
	if (multi1 % multi2 == 0 || multi2 % multi1 == 0) 
	{System.out.println("São múltiplos!");
	}
	else
	{System.out.println("Não são múltiplos!");
	}*/
	
	/*========================================================*/
	
	/*int hora1, hora2, totalHora;

	hora1 = sc.nextInt();
	hora2 = sc.nextInt();

	if (hora1 < hora2) {
	    totalHora = hora2 - hora1;
	} else {
	    totalHora = 24 - hora1 + hora2;
	}

	System.out.printf("O JOGO DUROU %d HORAS", totalHora);*/
	
	/*====================================================*/
	
	/*int codigo, quantidade;
	double valorTotal = 0;
	
	codigo = sc.nextInt();
	quantidade = sc.nextInt();
	
	
	if (codigo == 1) {valorTotal = quantidade * 4;}
	
	else if (codigo == 2) {valorTotal = quantidade * 4.5;}
	
	else if (codigo ==3) {valorTotal = quantidade * 5;}
	
	else if (codigo == 4) {valorTotal = quantidade * 2;}
	
	else if (codigo == 5) {valorTotal = quantidade * 1.5;}
	
	System.out.printf("Total: R$ %.2f%n", valorTotal);*/
	
	/*==============================================*/
	
	
	/*double valorIntervalo = sc.nextDouble();
	
	if (valorIntervalo < 0 || 100 < valorIntervalo) {System.out.println("Valor Inválido");}
	else if (valorIntervalo <= 25) {System.out.println("Intervalo [0,25]");}
	else if (valorIntervalo <= 50) {System.out.println("Intervalo [25,50]");}
	else if (valorIntervalo <=75) {System.out.println("Intervalo [75,100]");}*/
	
	/*===========================================================================*/
	
	/*double cooX = sc.nextDouble();
	double cooY = sc.nextDouble();
	
	if (cooX > 0 && cooY > 0) {System.out.println("Q1");}
	else if (cooX > 0 && cooY < 0) {System.out.println("Q4");}
	else if (cooX < 0 && cooY > 0) {System.out.println("Q2");}
	else if (cooX < 0 && cooY < 0) {System.out.println("Q3");}
	else if (cooX == 0 && cooY != 0) {System.out.println("Eixo X");}
	else if (cooX != 0 && cooY == 0) {System.out.println("Eixo Y");}
	else if (cooX == 0 && cooY == 0) {System.out.println("Origem");}*/
	
	/*=============================================================*/
	
	
	double salario = sc.nextDouble();
	
	double imposto;
	if (salario <= 2000) {imposto = 0.0;}
	else if (salario <= 3000) {imposto = (salario - 2000) * 0.08;}
	else if (salario <= 4500) {imposto = (salario - 3000) *0.18 + 1000 * 0.08;}
	else {imposto = (salario - 4500) * 0.28 + 1.500 * 0.18 + 1000 * 0.08;}
	if (imposto == 0.0) {System.out.println("Isento");}
	else {System.out.printf("Imposto: %.2f%n", imposto);}
	
	/* ERRADO - DEVO CONSERTAR */
	
	
	
	
	
			
			
			
			
			
	
	
	
	
	
	
	
	sc.close();
	
	}
}