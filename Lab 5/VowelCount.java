import java.util.Scanner;
class NoOfVowel{
	int totalvowelcount=0;
	public NoOfVowel(){
		Scanner sc = new Scanner(System.in);
		String temp;
		do{
			System.out.println("Enter Sentence :");
			temp = sc.nextLine();
			for(int i = 0 ; i < temp.length() ; i++)
			{
				if(temp.charAt(i) =='a' || temp.charAt(i) =='e' || temp.charAt(i) =='i' || temp.charAt(i) =='o' || temp.charAt(i) =='u')
				{
					totalvowelcount++;
				}
			}
		}while(!temp.equals("quit"));
		System.out.println(totalvowelcount-2);
	}
} 
public class VowelCount{
	public static void main(String[] args){
		NoOfVowel n = new NoOfVowel();
	}
}