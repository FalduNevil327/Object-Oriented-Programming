import java.util.Scanner;
public class Arrayint{
	public static void main(String[] args) {
		
		int[] num;
		num=new int[4];
		int sum=0;
		Scanner output=new Scanner(System.in);
		System.out.println("Enter numbers");

		for(int i=0;i<4;i++){
			num[i]=output.nextInt();
			sum=sum+num[i];
		}
		System.out.println("sum = "+sum);
		double avg=(sum/4);
		System.out.println("average = "+avg);
	}
}