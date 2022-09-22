package zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
