
public class BankAccount {
	private int accountNumber;
	private int balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balannce) {
		this.balance = balannce;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int depositFunds(int deposit) {
		balance+=deposit;
		return balance;
	}
	
	public int withdrawFunds(int withDraw) {
		if(balance<0) {
			return 0;
		}else {
			balance-=withDraw;
			return balance;
		}
	}
}
