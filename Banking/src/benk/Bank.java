package benk;
import java.util.ArrayList;

public class Bank {
private ArrayList<Customer> customers;
private int numberofCustomers;
private String bankName;
public Bank(String bankName, int numberofCustomers, ArrayList<Customer> customers) {
	this.bankName = bankName;
	this.numberofCustomers = numberofCustomers;
	this.customers = customers;
}
public void addCustomer(String firstName, String lastName) {
	Customer newCustomer = new Customer(firstName, lastName);
	this.customers.add(newCustomer);
}
public int getNumberofCustomers() {
	this.numberofCustomers = customers.size();
	return this.numberofCustomers;
}

public Customer getCustomer(int index) {
	return customers.get(index);
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}

}

