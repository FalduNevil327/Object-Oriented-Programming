import java.util.Scanner;
class Circle{
	int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public double getArea(){
		return Math.PI*Math.pow(this.radius,2);
	}
} 
public class CircleArea{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		int r = sc.nextInt();
		Circle c1 = new Circle(r);
		double a1 = c1.getArea();

		System.out.println("Radius : "+a1);
	}
}