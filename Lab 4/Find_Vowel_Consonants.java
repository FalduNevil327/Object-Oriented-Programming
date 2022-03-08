import java.util.Scanner;
public class Find_Vowel_Consonants{

	public static void main(String[] args)
	{
		Scanner output=new Scanner(System.in);
		System.out.println("Enter sentence:");
		String s = output.nextLine();
		String s1=s.toLowerCase();
		int v=0,c=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				v++;
			else
				c++;
		}
		System.out.println("Vowels are "+v);
	System.out.println("Consonants are: " +c);
	}
	

}