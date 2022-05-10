class StaticDemo{
	static int count=0;
	StaticDemo()
	{
		count++;
		System.out.println(count);
	}
}

public class MainStaticDemo{
	public static void main(String[] args){
		StaticDemo s=new StaticDemo();
		StaticDemo s1=new StaticDemo();
		StaticDemo s2=new StaticDemo();
		StaticDemo s3=new StaticDemo();
		StaticDemo s4=new StaticDemo();
		StaticDemo s5=new StaticDemo();
	}
}