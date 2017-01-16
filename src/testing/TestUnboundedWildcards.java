package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import customers.Company;
import customers.CustomerInterface;
import customers.CustomerInterfaceComparator;

public class TestUnboundedWildcards {

	public static void checkSize(List<? extends CustomerInterface> someList) {
		if (someList.size() > 100) {
			System.out.println("This is a big list.");
		} else {
			System.out.println("This is a small list.");
		}
	} // end of method

	public static void main(String[] args) {
		List<Company> companyList = new ArrayList<Company>();
		Company c1 = new Company("Marja Line", "Marysquare 12", "MarYSol");
		Company c2 = new Company("Maruja Line", "Marysquare 12", "MarYSol2");
		Company c3 = new Company("Marija Line", "Marysquare 12", "MarYSol3");
		Company c4 = new Company("Varja Line", "Marysquare 12", "MarYSol");
		Company c5 = new Company("Vanja Line", "Marysquare 12", "MarYSol2");
		Company c6 = new Company("Marla Line", "Marysquare 12", "MarYSol3");


		companyList.add(c1);
		companyList.add(c2);
		companyList.add(c3);
		companyList.add(c4);
		companyList.add(c5);
		companyList.add(c6);

		Collections.sort(companyList, new CustomerInterfaceComparator());

		for (Company comp : companyList) {
			System.out.println(comp.getName());
		}
		
		checkSize(companyList);

	}// end of main

} // end of class
