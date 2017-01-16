package customers;

public class Person implements CustomerInterface {

	static private int idCounter;
	private int id;
	private String name;
	private String address;
	private int age;
	
		
	public Person(String name, String address, int age) {
		idCounter++;
		this.id = idCounter;
		this.name = name;
		this.address = address;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", toString()="
				+ super.toString() + "]";
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

	public int getAge() {
		return age;
	}

}
