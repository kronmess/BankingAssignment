package benk;

public class Customer {
private String firstName;
private String lastName;
private Account Account;

public Customer(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Account getAccount() {
	return Account;
}
public void setAccount(Account account) {
	Account = account;
}
}
