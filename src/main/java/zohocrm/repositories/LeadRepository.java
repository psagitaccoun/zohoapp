package zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
