package exercicios.basics;
import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x,y;
		double soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		/* ======================================================*/
		
		double raio, areaCirculo;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		areaCirculo = pi * raio * raio;
				
		System.out.printf("%.4f\n", + areaCirculo);
		
		/* ======================================================*/
		
		int A, B , C , D, diferença;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
				
		diferença = A * B - C * D;
				
		System.out.println("DIFERENÇA = " + diferença);
		
		
		/* ======================================================*/
		
		int cpf;
		double money, horas, salario;
		
		cpf = sc.nextInt();
		money = sc.nextDouble();
		horas = sc.nextDouble();
		
		salario = money * horas;
		
		System.out.println("NUMBER = " + cpf);
		System.out.printf("SALARY = US$ %.2f\n", salario);
		
		/* ======================================================*/
		
		int x1, y1, x2, y2;
		double z1, z2, total;
		
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		z1 = sc.nextDouble();
		
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		z2 = sc.nextDouble();
		
		total = y1 * z1 + y2 * z2;
		System.out.printf("VALOR A PAGAR = %.2f%n", total);
		
		
		/* ======================================================*/
		
		double base1, base2, altura, triangulo, circulo, trapezio, quadrado, retangulo;
		
		base1 = sc.nextDouble();
		base2 = sc.nextDouble();
		altura = sc.nextDouble();
		
		triangulo = base1 * altura / 2;
		circulo = pi * altura * altura; /*raio*/
		trapezio = (base1 + base2) * altura /2;
		quadrado = base2 * base2;
		retangulo = base1 * base2;
		
		System.out.printf("TRIÂNGULO = %.3f%n", + triangulo);
		System.out.printf("CÍRCULO = %.3f%n", + circulo);
		System.out.printf("TRAPÉZIO = %.3f%n", + trapezio);
		System.out.printf("QUADRADO = %.3f%n", + quadrado);
		System.out.printf("RETÂNGULO = %.3f%n", + retangulo);
		
		
		sc.close();
		
	}

}
