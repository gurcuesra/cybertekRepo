
public class TaskEncapsulation {
	
	private String accountNumber;
	private double accountBalance;
	private String customerName;
	private String customerEmail;
	private int customerPhoneNumber;
	
	public void deposit(double depositAmount) {
		this.accountBalance+=depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.accountBalance-withdrawalAmount<0) {
			System.out.println("Only " + this.accountBalance + " available. Withdrawal no processed.");
		}else {
			this.accountBalance-=withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);
		}
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

}
