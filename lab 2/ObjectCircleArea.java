import java.util.Scanner;
public class ObjectCircleArea{
	static float calculatearea(int r)
	{
		float ans=(float)3.14*r*r;
		return ans;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter R:");
		int r =input.nextInt();

		ObjectCircleArea object1= new ObjectCircleArea();

		float ans =object1.calculatearea(r);
		System.out.println("Area="+ans);

	}
}