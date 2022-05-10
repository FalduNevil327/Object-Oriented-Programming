class Bank_Account{
	int accountNo;
	String username;
	String email;
	String accountType;
	double accountBalance;

	public Bank_Account(int accountNo,String username,String email,String accountType,double accountBalance)
	{
		this.accountNo = accountNo;
		this.username = username;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public String getAccountDetail(){
		return accountNo+"-"+username+"-"+email+"-"+accountType+"-"+accountBalance;
	}

	public void displayAccountDetail(){
		 System.out.println(" Account Number :  " + this.accountNo);
        System.out.println(" User Name : " + this.username);
        System.out.println(" email :  " + this.email);
        System.out.println(" Account Type :  " + this.accountType);
        System.out.println(" Balance : " + this.accountBalance);
	}
}
public class Bankdemo{
	public static void main(String[] args){
		Bank_Account ba = new Bank_Account(123,"Nevil","Nevil.com","saving",30000);
		ba.displayAccountDetail();

		
	}
}