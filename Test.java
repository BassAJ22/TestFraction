package practice;

public class Test {
	private int num;
	private int den;
	//this is a default so no arguments(?)
	
	public Test() {
		this.num=1;
		this.den=2;
	}
	public Test(int num, int den) {
		this.num=num;
		this.den=den;
	}
	public Test(int num) {
		this.num=num;
		this.den=1;
	}
	public void setNumerator(int num) {
		this.num=num;
	}
	public void setDenominator(int den) {
	}
	public int getNumerator() {
		return this.num;
	}
	public int getDenominator() {
		return this.den;
	}
	public void add(Test adder) {
		int n1=this.num;
		int n2=adder.getNumerator();
		int d1=this.den;
		int d2=adder.getDenominator();
		int newDen=d1*d2;
		int newNum=(n1*d2)+(n2*d1);
		System.out.println(String.valueOf(newNum)+"/"+String.valueOf(newDen));
	}
	public void multiply(Test multiplier) {
		int n1=this.num;
		int n2=multiplier.getNumerator();
		int d1=this.den;
		int d2=multiplier.getDenominator();
		int newDen=d1*d2;
		int newNum=n1*n2;
		System.out.println(String.valueOf(newNum)+"/"+String.valueOf(newDen));
	
	}
	public void subtract(Test subtractor) {
		int n1=this.num;
		int n2=subtractor.getNumerator();
		int d1=this.den;
		int d2=subtractor.getDenominator();
		int newDen=d1*d2;
		int newNum=(n1*d2)-(n2*d1);
		System.out.println(String.valueOf(newNum)+"/"+String.valueOf(newDen));
}
	public void divide(Test dividor) {
		int n1=this.num;
		int n2=dividor.getNumerator();
		int d1=this.den;
		int d2=dividor.getDenominator();
		int newDen=d1/d2;
		int newNum=n1/n2;
		System.out.println(String.valueOf(newNum)+"/"+String.valueOf(newDen));
	
	}
	
}
