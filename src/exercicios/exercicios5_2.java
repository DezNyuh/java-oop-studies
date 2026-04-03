package exercicios;

import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.Employee;

public class exercicios5_2 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Updated data: " + employee);
		
		
		
		
		
		
		
		sc.close();
	}
}
