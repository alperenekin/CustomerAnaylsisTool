package hw6.domain;
/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
public interface ICustomerListAnalytics {

	double getNumberOfFemaleCustomers();

	double getNumberOfSeniorCustomers();

	double getNumberOfAdultCustomers();

	double getNumberOfYoungCustomers();

	boolean add(Customer customer);

	double getNumberOfMaleCustomers();
}
