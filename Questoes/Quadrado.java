package Questoes;

public class Quadrado {
	double lado;
	public Quadrado(double x) {
		lado=x;
	}
	double area() {
		double a=lado*lado;
		return a;
		
	}
	double perimetro() {
		double p= 4*lado;
		return p;
		
	}
	public static void main(String[] args) {
		Quadrado q1=new Quadrado(2);
		Quadrado q2=new Quadrado(4);
		Quadrado q3=new Quadrado(5);
		System.out.println(q1.area());
		System.out.println(q1.perimetro());
		System.out.println(q2.area());
		System.out.println(q2.perimetro());
		System.out.println(q3.area());
		System.out.println(q3.perimetro());
		}
}

