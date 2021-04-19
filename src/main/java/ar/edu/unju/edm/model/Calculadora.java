package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private double a,b;
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	public Calculadora(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + "]";
	}
	
	public double calcularSuma() {
		return a+b;
	}
	
	public double calcularResta() {
		return a-b;
	}
	
	public double calcularMultiplicacion() {
		return a*b;
	}
	
	public double calcularDivision() {
		return a/b;
	}
	
	
	
	

}




