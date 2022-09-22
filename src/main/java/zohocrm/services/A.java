package zohocrm.services;

import java.util.List;

import zohocrm.entities.Lead;

public interface A {

	void saveOneLead(Lead lead);

	Lead getOneLead(long id);

	void deleteOneLead(long id);

	List<Lead> listAll();

}
