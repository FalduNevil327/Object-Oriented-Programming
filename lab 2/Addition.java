import java.util.Scanner;
public class Addition{
	int calculateAdd(int a,int b)
		{
			int c = a+b;
			return c; 
		}
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A:");
		int a =input.nextInt();

		System.out.println("Enter B:");
		int b =input.nextInt();

		Addition object1 = new Addition();
		int c=object1.calculateAdd(a,b);

		System.out.println("Addition of "+ a+ " And " +b+ " is = "+c);


	}
}