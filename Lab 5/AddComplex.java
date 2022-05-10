class ComplexNumber{
	double i;
	double r;
	public ComplexNumber(){
		this.r = 0;
		this.i = 0;
	}

	public ComplexNumber(double r,double i){
		this.r = r;
		this.i = i;
	}

	public void printAddition(ComplexNumber co2)
	{
		String temp;
		double tempI = this.i + co2.i;
		double tempR = this.r + co2.r;
		System.out.println(tempR + " + " + tempI +"i");
	}

}
public class AddComplex{
	public static void main(String [] args){
		ComplexNumber co1 = new ComplexNumber(5,2);
		ComplexNumber co2 = new ComplexNumber(2,5);
		co1.printAddition(co2);
	}

}