package hw6.domain.customer;
/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import hw6.domain.Customer;

public class CustomerCreatorWithExceptions extends Customer{
	public Customer createCustomer(int age, char gender, String name) {
		CustomerCreatorWithExceptions customer=new CustomerCreatorWithExceptions();
		customer.setAge(age);
		customer.setType(age);
		customer.setGender(gender);
		customer.setName(name);
		return customer;
	}



}
