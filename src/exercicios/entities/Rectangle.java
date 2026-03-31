package exercicios.entities;

public class Rectangle {

	public double a;
	public double b;

	public double area() {
		double areaRect = a * b;
		double p = 2 * (a + b);
		return Math.sqrt(a * a + b * b);
	}
}
