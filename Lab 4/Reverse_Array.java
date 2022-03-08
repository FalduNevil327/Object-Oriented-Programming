import java.util.Scanner;
public class Reverse_Array{
	public static void main(String[] args) {

		System.out.println("Enter numbers of array size");
		Scanner output=new Scanner(System.in);
		int n=output.nextInt();


		int num[] = new int[n],i;

		
		System.out.println("Enter numbers");

		for(i=0;i<n;i++){

			num[i]=output.nextInt();

		}
		System.out.println(" Reverse_Array");

		for(i=(n-1);i>=0;i--){
			System.out.println(num[i]);
		}
	}

}