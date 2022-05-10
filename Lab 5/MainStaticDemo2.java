class ThisStatic{
	static int n=1;
	ThisStatic(){
		this.n=n+2;
		System.out.println(this.n);
	}
}
class MainStaticDemo2{
	public static void main(String[] args){
	ThisStatic s=new ThisStatic();
	
}
}