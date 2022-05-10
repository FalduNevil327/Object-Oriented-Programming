import java.util.Scanner;
public class AreaOfCircle{
	float circlearea(int r)
	{
		float ans = ((float)3.14*r*r);
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius : ");
		int r = input.nextInt();

		AreaOfCircle obj1 = new AreaOfCircle();
		float AreaOfCircle = obj1.circlearea(r);

		System.out.println("Area of circle = "+AreaOfCircle);
	}
}