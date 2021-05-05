package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService checkService; // Referans tutucu interface
	 public StarbucksCustomerManager(CustomerCheckService checkService ) {
		this.checkService = checkService;
	}
	
	@Override
	public void Save(Customer customer) {
		//CustomerCheckManager checkManager = new CustomerCheckManager();
		if(checkService.checkIfRealPerson(customer)) {
			System.out.println(customer.firstName+ " saved to db");
		}
		else {
			System.out.println("Failed to save to db due to invalid person");
		}
		
	}
}
