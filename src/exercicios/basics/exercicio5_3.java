package exercicios.basics;

import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.Student;

public class exercicio5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Student student = new Student();

		String name = sc.nextLine();

		student.firstNote = sc.nextDouble();
		if (student.firstNote > 30) {
			System.out.println("INVALID NOTE! MAX: 30");
			student.firstNote = sc.nextDouble();
		}

		student.secondNote = sc.nextDouble();
		if (student.secondNote > 35) {
			System.out.println("INVALID NOTE! MAX: 35");
			student.secondNote = sc.nextDouble();
		}

		student.thirdNote = sc.nextDouble();
		if (student.thirdNote > 35) {
			System.out.println("INVALID NOTE! MAX: 35");
			student.thirdNote = sc.nextDouble();
		}

		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();
	}
}
