// -> VIP Customer question


public class Assignment21_2 {
	private String name;
	private int creditLimit;
	private String email;
	
	public Assignment21_2() {
		this("Esra", 1200, "test@email.com");
	}
	
	
	
	public Assignment21_2(String name, int creditLimit) {
		this.name = name;
		this.creditLimit = creditLimit;
		email = "test@email.com";
	}

	public Assignment21_2(String name, int creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}



	public int getCreditLimit() {
		return creditLimit;
	}



	public String getEmail() {
		return email;
	}



	
	
	
}
