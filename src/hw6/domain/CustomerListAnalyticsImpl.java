package hw6.domain;
/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.util.ArrayList;

public class CustomerListAnalyticsImpl implements ICustomerListAnalytics {
	ArrayList<Customer> aList =new ArrayList<Customer>();
	public double getNumberOfFemaleCustomers() {
		double counter=0;
		for(Customer customers : aList) {
			if(customers.getGender()=='f' || customers.getGender()=='F') {
				counter+=1;
			}
		}
		return counter;
	}

	public double getNumberOfSeniorCustomers() {
		double counter=0;
		for(Customer customers : aList) {
			if(customers.getAge()>=60) {
				counter+=1;
			}
		}
		return counter;
	}

	public double getNumberOfAdultCustomers() {
		double counter=0;
		for(Customer customers : aList) {
			if(customers.getAge()>30 && customers.getAge()<59) {
				counter+=1;
			}
		}
		return counter;
	}

	public double getNumberOfYoungCustomers() {
		double counter=0;
		for(Customer customers : aList) {
			if(customers.getAge()>18 && customers.getAge()<29) {
				counter+=1;
			}
		}
		return counter;

	}

	public boolean add(Customer customer) {
		if(customer==null) {
			return false;
		}
		aList.add(customer);
		return true;
	}

	public double getNumberOfMaleCustomers() {
		double counter=0;
		for(Customer customers : aList) {
			if(customers.getGender()=='m' || customers.getGender()=='M') {
				counter+=1;
			}
		}
		return counter;
	}
	@Override
	public String toString() {
		return "CustomerListImpl ["
				+ "buyers=["
				+ aList.get(0).getType() +" [super=Customer [age=" + aList.get(0).getAge() + ", gender=" + aList.get(0).getGender() +", name="+ aList.get(0).getName() +", type=" + aList.get(0).getType() +"]], "
				+ aList.get(1).getType() +" [super=Customer [age=" + aList.get(1).getAge() + ", gender=" + aList.get(1).getGender() +", name="+ aList.get(1).getName() +", type=" + aList.get(1).getType() +"]], "
				+ aList.get(2).getType() +" [super=Customer [age=" + aList.get(2).getAge() + ", gender=" + aList.get(2).getGender() +", name="+ aList.get(2).getName() +", type=" + aList.get(2).getType() +"]]]]";
	}
}
