import java.util.Scanner;
public class TempFehrenheitToCelsius{
	float Conversation(float f){
		float ans = (f-32f)*(5f/9f);
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Temperature in Feranhit : ");
		float f = input.nextFloat();
		
		TempFehrenheitToCelsius obj1 = new TempFehrenheitToCelsius();
		float ans=obj1.Conversation(f);
		
		System.out.println("Celcius = "+ans);
	}
	
}