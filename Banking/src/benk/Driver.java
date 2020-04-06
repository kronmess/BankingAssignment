package benk;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Account acc1 = new Account(500);
		System.out.println(acc1.getBalance());
		acc1.deposit(400);
		System.out.println(acc1.getBalance());
		acc1.withdraw(800);
		System.out.println(acc1.getBalance());
		Customer customer1 = new Customer("Vincentius","Arnold");
		System.out.println(customer1.getFirstName());
		System.out.println(customer1.getLastName());
		customer1.setFirstName("Timotius");
		customer1.setLastName("ohyeahyeah");
		System.out.println(customer1.getFirstName());
		System.out.println(customer1.getLastName());
		customer1.setAccount(acc1);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Bank bank1 = new Bank("BankE",0,customers);
		bank1.addCustomer("Testing","Time");
		System.out.println(customers.get(0));
		System.out.println(bank1.getNumberofCustomers());
		bank1.addCustomer("Thanks","Teem");
		System.out.println(customers.get(1));
		
		
	
	}

}
