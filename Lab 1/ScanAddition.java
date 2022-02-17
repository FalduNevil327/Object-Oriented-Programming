// import java.util.*; // for import all the utilites
import java.util.Scanner;
public class ScanAddition{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a");
		int a= input.nextInt();
		System.out.println("Enter b");
		int b= input.nextInt();
		int c=a+b;
        // System.out.println("Addition :"+(a+b));
		System.out.println("Addition:"+c);
	}
}