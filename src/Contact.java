
public class Contact {
	private String FirstName;
	private String LastName;
	private String Phone;
	private String Address;
	
	public Contact(String firstName, String lastName, String phone, String address) {
		FirstName = firstName;
		LastName = lastName;
		Phone = phone;
		Address = address;
	}
	public Contact(String firstName, String lastName, String phone) {
		FirstName = firstName;
		LastName = lastName;
		Phone = phone;
	}
	public String getName() {
		return FirstName + " " + LastName;
	}

}

