
public class main {

	public static void main(String[] args) {

		Contact elinor = new Contact("Elinor", "Bendelac", "05444444", "Nesher");
		Contact yossi = new Contact("Yossi", "Ben Zaken","0548152600","Shima");
		PhoneBook phoneBook = new PhoneBook(10);
		phoneBook.addContact(yossi);
		phoneBook.addContact(elinor);
		phoneBook.deleteContact("Yossi Ben Zaken");
		System.out.println("Check");
	}

}
