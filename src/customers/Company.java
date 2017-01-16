package customers;

public class Company implements CustomerInterface {

	static private int idCounter;
	private int id;
	private String name;
	private String address;
	private String companyName;
	
	
	
	public Company(String name, String address, String companyName) {
		idCounter++;
		this.id = idCounter;
		this.name = name;
		this.address = address;
		this.companyName = companyName;
	}
	
	
	

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address
				+ ", companyName=" + companyName + ", toString()=" + super.toString() + "]";
	}




	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAddress() {
		return address;
	}

	public String getCompanyName() {
		return companyName;
	}

	
	
}
