import java.util.Scanner;
public class ObjectArea{
	static float calculatearea(int r)
	{
		float ans=(float)3.14*r*r;
		return ans;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter R:");
		int r =input.nextInt();
		float ans = calculatearea(r);
		System.out.println("Area="+ans);

	}
}