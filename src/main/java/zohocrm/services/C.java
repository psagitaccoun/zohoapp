package zohocrm.services;

import java.util.List;

import zohocrm.entities.Contact;

public interface C {

	void saveOneContact(Contact contact);

	List<Contact> listAllContacts();

	Contact getOneContact(long id);

}
