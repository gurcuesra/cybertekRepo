
public class MainAccount {

	public static void main(String[] args) {
		BankAccount c1 = new BankAccount();
		c1.setAccountNumber(12345);
		c1.setBalance(100000);
		c1.setCustomerName("Mike");
		c1.setEmail("test@email.com");
		c1.setPhoneNumber(1234567890);
		
		int deposit  = c1.depositFunds(2000);  
		System.out.println(c1.getCustomerName()+ " blance after deposit $" + deposit);           // -> 102000
		
		int withdraw = c1.withdrawFunds(500);
		System.out.println(c1.getCustomerName()+ " blance after withdraw $" + withdraw);          // -> 101500

	}

}
