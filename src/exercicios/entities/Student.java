package exercicios.entities;

public class Student {
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	
	public double finalGrade() {
		return firstNote + secondNote + thirdNote;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60) {
			return 60 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
}
