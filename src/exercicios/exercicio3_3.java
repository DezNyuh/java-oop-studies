import java.util.Scanner;

public class exercicio3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int combustivel = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool ++;
				System.out.println("Você abasteceu com álcool!");
			} else if (combustivel == 2) {
				gasolina ++;
				System.out.println("Você abasteceu com gasolina!");
			} else if (combustivel == 3) {
				System.out.println("Você abasteceu com diesel!");
				diesel ++;
			} else {
				System.out.println("Código inválido, Informe um número de 1 a 4");
			}
			combustivel = sc.nextInt();
		}

		System.out.printf(" MUITO OBRIGADO!\n Álcool: %d\n Gasolina: %d\n Diesel: %d\n", alcool, gasolina, diesel);
		sc.close();
	}
}
