
public class PhoneBook {
	private Contact[] contact;
	private Integer index;
	
	public PhoneBook(Integer num) {
		contact = new Contact[num];
		index = 0;
	}
	
	public void addContact(Contact c)
	{
		contact[index] = c;
		index++;
	}
	
	public void deleteContact(String name) {
		for(int i = 0; i < contact.length;i++)
			if(name.equalsIgnoreCase(contact[i].getName())){				
				fixArray(i);
				break;
			}
	}
	private void fixArray(int start) {
		for(;start<index;start++) {
			contact[start] = contact[start+1];
		}
		index--;
	}
}
