package zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohocrm.entities.Lead;
import zohocrm.repositories.LeadRepository;
@Service
public class B implements A {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public Lead getOneLead(long id) {
Optional<Lead> findById = leadRepo.findById(id);
Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteOneLead(long id) {
    leadRepo.deleteById(id);		
	}

	@Override
	public List<Lead> listAll() {
List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}

}
