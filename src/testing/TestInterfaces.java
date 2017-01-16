package testing;

import java.util.ArrayList;
import java.util.List;

import customers.Company;
import customers.CustomerInterface;
import customers.Person;

public class TestInterfaces {

	public static void main(String[] args) {
		//Inheritance example
		//Using and interface as a parameterized type		
		List<CustomerInterface> customers = new ArrayList<CustomerInterface>();
		Company c1 = new Company("Maria Ehre", "1 Circu Street", "CircuEx");
		Company c2 = new Company("Olga Tang", "1 Circu Street", "CircuTwo");
		
		Person p1 = new Person("Marla Ihre", "1 Marysquare", 35);
		Person p2 = new Person("Sara Gomez", "1 Gatsquare", 41);
		
		customers.add(c1); 	customers.add(c2);
		customers.add(p1);	customers.add(p2);
		
//		System.out.println(c1);	System.out.println(c2);
//		System.out.println(p1); System.out.println(p2);
		
		for (CustomerInterface customer : customers){
			System.out.println(customer.getName());
		}
				
	}
}
