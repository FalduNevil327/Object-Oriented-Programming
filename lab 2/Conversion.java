import java.util.Scanner;
public class Conversion{
	double ftoc(float f)
	{
		double FtoCConversion=(f-32)*(5/9);
		return FtoCConversion;
	}
		public static void main(String[] args) {
			 Scanner input = new Scanner(System.in);
			 System.out.println("Enter Feronhite:");
			float f = input.nextFloat();

			 Conversion object1= new Conversion();
			double FtoCConversion = object1.ftoc(f);

			 System.out.println("F TO c Conversion is= "+FtoCConversion);
		}
}