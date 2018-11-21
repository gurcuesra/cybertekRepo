public class EncapsulationClass {

	public static void main(String[] args) {
		Car porsche = new Car();
		porsche.setModel("911");
		String model = porsche.getModel();
		System.out.println(model);
		
		System.out.println("----------------------");
		
		TaskEncapsulation mikeAccount = new TaskEncapsulation();
		mikeAccount.setAccountNumber("5555555555");
		mikeAccount.setAccountBalance(2.5);
		mikeAccount.setCustomerName("Mike");
		mikeAccount.withdrawal(100.0);
		
		mikeAccount.deposit(150.000);
		mikeAccount.withdrawal(50.0);
		
		System.out.println(mikeAccount.getCustomerName());

	}

}
