import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.firstName = "H�seyin";
		customer1.lastName = "Dervi�";
		customer1.id=1;
		customer1.nationalityId="123";
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		starbucksCustomerManager.Save(customer1);
	}

}
